package com.wussines.tutoriales.junit;

import org.springframework.stereotype.Component;

@Component
public class MyMath {
	
	int sum(int[] numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}
}
