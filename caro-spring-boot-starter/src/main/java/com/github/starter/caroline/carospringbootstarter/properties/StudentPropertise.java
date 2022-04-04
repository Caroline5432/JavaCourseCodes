package com.github.starter.caroline.carospringbootstarter.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName StudentPropertise
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 14:08
 **/
@ConfigurationProperties(prefix = "student")
@Data
public class StudentPropertise {
    private int id;
    private String name;
}
