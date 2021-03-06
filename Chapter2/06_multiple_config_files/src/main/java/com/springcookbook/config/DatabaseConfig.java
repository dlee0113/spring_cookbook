package com.springcookbook.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConfig {
	@Bean
	public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        
	        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/db1");
	        dataSource.setUsername("root");
	        dataSource.setPassword("123");
	         
	        return dataSource;
	}
}
