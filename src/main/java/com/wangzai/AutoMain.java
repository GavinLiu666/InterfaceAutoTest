package com.wangzai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com/wangzai/dao")
@SpringBootApplication
public class AutoMain {


    public static void main(String[] args) {
        SpringApplication.run(AutoMain.class,args);
    }

}
