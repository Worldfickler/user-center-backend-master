package com.example.usercenterbackendmaster;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.usercenterbackendmaster.mapper")
public class UserCenterBackendMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterBackendMasterApplication.class, args);
    }

}
