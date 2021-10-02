package com.wussines.tutoriales.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.wussines.tutoriales.Spring5JUnitApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Spring5JUnitApplication.class)
public class MyMathTest {
	
	@Autowired
	MyMath mth;

	@Test
	public void test() {
		int result = mth.sum(new int[] {1,2,3});
		System.out.println(mth);
		System.out.println(result);
		assertEquals(5, result);
	}

}
