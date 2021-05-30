package com.example.CrudOperation;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.example.CrudOperation.Repository") 
@ComponentScan({"com.example.CrudOperation","com.example.dao"})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
