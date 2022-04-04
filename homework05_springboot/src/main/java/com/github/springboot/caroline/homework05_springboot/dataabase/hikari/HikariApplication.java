package com.github.springboot.caroline.homework05_springboot.dataabase.hikari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName HikariApplication
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 15:07
 **/
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.github.springboot.caroline.homework05_springboot.dataabase.hikari")
public class HikariApplication {
    public static void main(String[] args) {
        SpringApplication.run(HikariApplication.class, args);
    }
}
