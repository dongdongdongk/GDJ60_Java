package com.iu.api3.exception;

import java.util.Random;

public class ExceptionSample1 {

	public void ex1() throws ArithmeticException, NullPointerException {
		Random random = new Random();
		int num = random.nextInt(2);
		
		num = 10/num;
		
		System.out.println(num);
	}
}
