package com.wussines.databases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DatabaseDemoApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DatabaseDemoApplication.class);

	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(DatabaseDemoApplication.class, args);
		LOGGER.debug("hola {}", appCtx);
	}

}
