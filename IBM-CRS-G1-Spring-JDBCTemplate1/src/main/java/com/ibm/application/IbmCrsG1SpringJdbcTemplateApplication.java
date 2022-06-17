package com.ibm.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan({"com.ibm.*"})

@SpringBootApplication
public class IbmCrsG1SpringJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbmCrsG1SpringJdbcTemplateApplication.class, args);
		
	}

}
