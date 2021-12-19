package com.wussines.tutoriales.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wussines.tutoriales.repo.Dao1;

@Service
public class Bussines1 {
	
	@Autowired
	private Dao1 dao1;
	
	public String calculateSomething() {
		return dao1.retrieveSomething();
	}
	
}
