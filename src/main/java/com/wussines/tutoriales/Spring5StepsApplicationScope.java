package com.wussines.tutoriales;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wussines.tutoriales.scope.PersonaDao;


public class Spring5StepsApplicationScope {
	
	private static Logger LOGGER = LoggerFactory.getLogger(Spring5StepsApplicationScope.class);

	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(Spring5StepsApplicationScope.class, args);
		
		PersonaDao personaDao = appCtx.getBean(PersonaDao.class);
		
		PersonaDao personaDao2 = appCtx.getBean(PersonaDao.class);
		
		LOGGER.info("{}", personaDao);
		LOGGER.info("{}", personaDao.getJdbcConnection());
		
		LOGGER.info("{}", personaDao2);
		LOGGER.info("{}", personaDao2.getJdbcConnection());
	}

}
