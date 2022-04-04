package com.github.starter.caroline.carospringbootstarter.config;

import com.github.starter.caroline.carospringbootstarter.properties.StudentPropertise;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName StudentConfig
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 14:09
 **/
@Configuration
@EnableConfigurationProperties(StudentPropertise.class)
@ConditionalOnProperty(
        prefix = "student",
        name = "isopen",
        havingValue = "true"
)
public class StudentConfig {
}
