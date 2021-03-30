package com.chen.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Siter21
 * @Description 人事管理启动类
 * @date 2021/2/9-13:57
 */
@SpringBootApplication
@MapperScan("com.chen.server.mapper")
@EnableScheduling
public class HrApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrApplication.class,args);
    }
}