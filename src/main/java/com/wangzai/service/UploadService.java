package com.wangzai.service;

import com.wangzai.pojo.RequestInfo;
import com.wangzai.util.FileUtil;
import com.wangzai.util.ParseExcel;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Service
public class UploadService {

    private Logger logger = Logger.getLogger(UploadService.class);

    public List<RequestInfo> uploadFile(@RequestParam("uploadfile") MultipartFile file) {
        logger.info("uploadFile start");
        if (!file.isEmpty()) {
            String type = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));// 取文件格式后缀名
            String filename = System.currentTimeMillis() + type;// 取当前时间戳作为文件名
            String path = FileUtil.getTmpPath() + filename;// 存放位置
            File destFile = new File(path);
            try {
                // FileUtils.copyInputStreamToFile()这个方法里对IO进行了自动操作，不需要额外的再去关闭IO流
                FileUtils.copyInputStreamToFile(file.getInputStream(), destFile);// 复制临时文件到指定目录下
            } catch (IOException e) {
                logger.info("uploadFile error", e);
            }
            logger.info("uploadFile start");
            return ParseExcel.parseExcelToRequestInfo(destFile.getAbsolutePath());
        } else {
            return Collections.emptyList();
        }
    }

}
