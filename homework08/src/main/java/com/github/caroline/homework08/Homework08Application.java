package com.github.caroline.homework08;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.caroline.homework08.mappers")
public class Homework08Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework08Application.class, args);
    }

}
