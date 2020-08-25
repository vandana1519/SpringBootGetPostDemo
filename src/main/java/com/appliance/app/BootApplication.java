package com.appliance.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "com.appliance" })
@EntityScan("com.appliance.model")
@EnableJpaRepositories("com.appliance.repository")
@SpringBootApplication
public class BootApplication 
{
	static final Logger logger = LoggerFactory.getLogger(BootApplication.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(new Class[] { BootApplication.class }, args);
		logger.info("BootApplication : Main : Application loaded: ready to serve webservices");
	}
}
