package com.github.starter.caroline.carospringbootstarter.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @ClassName KlassProperties
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 14:36
 **/
@Data
@ConfigurationProperties(prefix = "klass")
public class KlassProperties {

    private List<StudentPropertise> students;

}
