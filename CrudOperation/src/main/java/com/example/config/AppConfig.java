package com.example.config;

import javax.activation.DataSource;

//import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.example")
@PropertySource("classpath:application.properties")
public class AppConfig {

	

		@Autowired
		Environment environment;

		private final String URL = "jdbc:postgresql://localhost:5432/Employee";
		private final String USER = "shweta_test";
		private final String DRIVER ="org.postgresql.Driver";
		private final String PASSWORD = "root";

		@Bean
		DataSource dataSource() {
			DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
			driverManagerDataSource.setUrl(environment.getProperty(URL));
			driverManagerDataSource.setUsername(environment.getProperty(USER));
			driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
			driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
			return (DataSource) driverManagerDataSource;
		}
	}

