package com.example.demo;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class MyContext {

    @Bean
    DataSource mariaDbDataSourEmployeeJpaRepoce() throws Exception {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://194.169.160.167:3306/HR?user=root&password=my-secret-pw");
        return dataSource;
    }
    @Bean
    JdbcTemplate springJdbcTemplate(DataSource mariaDbDataSource) {
        return new JdbcTemplate(mariaDbDataSource);
    }
}
