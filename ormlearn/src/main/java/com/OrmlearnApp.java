package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.service.CountryRepository;

@SpringBootApplication
@ComponentScan("com")
public class OrmlearnApp {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmlearnApp.class);
@Autowired
	static CountryRepository r;
	public static void main(String[] args) {
		SpringApplication.run(OrmlearnApp.class, args);
	
		LOGGER.info("Executing main");
	
	}

}
