package com.wangzai.service;

import com.wangzai.dao.RequestInfoMapper;
import com.wangzai.pojo.RequestInfoExample;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;
import com.wangzai.pojo.ExecDetail;
import com.wangzai.pojo.RequestInfo;

import javax.annotation.Resource;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class HttpClientHandler {

    @Resource
    private RequestInfoMapper requestInfoMapper;

    public List<ExecDetail> execAllRequest(String taskName) {
        List<ExecDetail> resultList = new ArrayList<>();
        RequestInfoExample example = new RequestInfoExample();
        List<RequestInfo> list = requestInfoMapper.selectByExample(example);

        for (RequestInfo requestInfo : list) {
            ExecDetail execDetail = sendHttpPostRequest(requestInfo);
            execDetail.setTaskname(taskName);
            resultList.add(execDetail);
        }

        return resultList;

    }

    private CloseableHttpClient getCloseableHttpClient() {
        //采用绕过验证的方式处理https请求
        SSLContext sslcontext = null;
        try {
            sslcontext = createIgnoreVerifySSL();
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            e.printStackTrace();
        }

        //设置协议http和https对应的处理socket链接工厂的对象
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", PlainConnectionSocketFactory.INSTANCE)
                .register("https", new SSLConnectionSocketFactory(sslcontext))
                .build();
        PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        HttpClients.custom().setConnectionManager(connManager);


        //创建自定义的httpclient对象
        //CloseableHttpClient client = HttpClients.createDefault();
        return HttpClients.custom().setConnectionManager(connManager).build();
    }

    private SSLContext createIgnoreVerifySSL() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sc = SSLContext.getInstance("SSLv3");

        // 实现一个X509TrustManager接口，用于绕过验证，不用修改里面的方法
        X509TrustManager trustManager = new X509TrustManager() {
            @Override
            public void checkClientTrusted(
                    java.security.cert.X509Certificate[] paramArrayOfX509Certificate,
                    String paramString) {
            }

            @Override
            public void checkServerTrusted(
                    java.security.cert.X509Certificate[] paramArrayOfX509Certificate,
                    String paramString) {
            }

            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };

        sc.init(null, new TrustManager[]{trustManager}, null);
        return sc;
    }


    private ExecDetail sendHttpPostRequest(RequestInfo requestInfo) {

        CloseableHttpClient httpClient = getCloseableHttpClient();

        // 创建Post请求
        HttpPost httpPost = new HttpPost(requestInfo.getUrl());

        StringEntity entity = new StringEntity(requestInfo.getParam(), "UTF-8");

        // post请求是将参数放在请求体里面传过去的;这里将entity放入post请求体中
        httpPost.setEntity(entity);

        httpPost.setHeader("Content-Type", "application/json;charset=utf8");

        // 响应模型
        CloseableHttpResponse response = null;
        try {
            // 由客户端执行(发送)Post请求
            response = httpClient.execute(httpPost);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();

            ExecDetail responseBean = new ExecDetail();
            String responseJson = EntityUtils.toString(Objects.requireNonNull(responseEntity));
            if (requestInfo.getResponse().equals(responseJson)) {
                responseBean.setIsExpected(true);
            } else {
                responseBean.setIsExpected(false);
                responseBean.setExecResponse(responseJson);
            }
            responseBean.setUrlId(requestInfo.getId());
            responseBean.setStatusLine(response.getStatusLine().toString());

            return responseBean;
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}
