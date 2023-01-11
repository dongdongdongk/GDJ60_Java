package com.iu.api3.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
	
		ExceptionSample1 e1 = new ExceptionSample1();
		ExceptionSample2 e2 = new ExceptionSample2();
		
		try {
			e2.ex2();
			
		} catch(Exception r) {
			
		}
	System.out.println("종료");
	}
}
