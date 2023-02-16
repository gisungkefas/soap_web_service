package com.kefas.soap_web_service.configoration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = {"com.springbootsoap.repository"})
@ComponentScan(value = "com.springbootsoap.*")
@EntityScan(basePackages = {"com.springbootsoap.model"})
public class DataStoredSetup {

    @Value("${spring.datasource.url")
    String databaseUrl;

    @Value("${soring.datasource.username}")
    String databaseUser;

    @Value("${spring.datasource.password")
    String databasePassword;

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(databaseUrl);
        dataSource.setUsername(databaseUser);
        dataSource.setPassword(databasePassword);
        return dataSource;
    }
}
