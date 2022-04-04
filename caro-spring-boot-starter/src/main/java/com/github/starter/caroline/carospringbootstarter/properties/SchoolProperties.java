package com.github.starter.caroline.carospringbootstarter.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName SchoolProperties
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 14:38
 **/
@Data
@ConfigurationProperties(prefix = "school")
public class SchoolProperties {
    private KlassProperties klasses;
    private StudentPropertise student;

}
