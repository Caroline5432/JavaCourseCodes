package com.github.springboot.caroline.homework05_springboot;

import com.github.starter.caroline.carospringbootstarter.properties.KlassProperties;
import com.github.starter.caroline.carospringbootstarter.properties.SchoolProperties;
import com.github.starter.caroline.carospringbootstarter.properties.StudentPropertise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Homework05SpringbootApplication implements CommandLineRunner {

    @Autowired
    private StudentPropertise studentPropertise;

    @Autowired
    private KlassProperties klassProperties;

    @Autowired
    private SchoolProperties schoolProperties;

    public static void main(String[] args) {
        SpringApplication.run(Homework05SpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(studentPropertise);
        System.out.println(klassProperties);
        System.out.println(schoolProperties);
    }
}
