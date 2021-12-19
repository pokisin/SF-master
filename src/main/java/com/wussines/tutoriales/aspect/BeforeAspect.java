package com.wussines.tutoriales.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//AOP
// Configuration
@Aspect
@Component
public class BeforeAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.wussines.tutoriales.services.*.*(..))")
	public void before(JoinPoint joinp) {
		logger.info("Intercepted Method Call {}", joinp);
	}
}
