package com.demo.configs;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/springjwt");
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("postgres");
        return dataSourceBuilder.build();
    }
}
