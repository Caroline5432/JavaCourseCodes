package com.example.tccdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.tccdemo.mappers")
public class TccDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TccDemoApplication.class, args);
    }

}
