package com.github.springboot.caroline.homework05_springboot.dataabase.hikari;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @ClassName MyHikariConfig
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 15:02
 **/
@Configuration
public class MyHikariConfig {

    @Bean(destroyMethod = "close")
    public DataSource dataSource() throws SQLException {
        HikariConfig config = new HikariConfig("/hikari.properties");
        HikariDataSource dataSource = new HikariDataSource(config);
        return dataSource;
    }

}
