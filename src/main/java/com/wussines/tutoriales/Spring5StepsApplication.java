package com.wussines.tutoriales;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wussines.tutoriales.services.Bussines1;
import com.wussines.tutoriales.services.Bussines2;

@SpringBootApplication
public class Spring5StepsApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Bussines1 business1;
	
	@Autowired
	Bussines2 business2;

	public static void main(String[] args) {
		SpringApplication.run(Spring5StepsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info( business1.calculateSomething() );
		logger.info( business2.calculateSomething() );
	}

}
