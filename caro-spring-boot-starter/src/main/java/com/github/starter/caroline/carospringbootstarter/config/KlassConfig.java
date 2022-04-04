package com.github.starter.caroline.carospringbootstarter.config;

import com.github.starter.caroline.carospringbootstarter.properties.KlassProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName KlassConfig
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 14:38
 **/
@Configuration
@EnableConfigurationProperties(KlassProperties.class)
public class KlassConfig {
}
