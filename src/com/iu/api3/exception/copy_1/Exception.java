package com.iu.api3.exception.copy_1;

import java.util.Random;

public class Exception {

	public static void main(String[] args) {
		String num = null;
		Random random = new Random();
		int n = random.nextInt(2);
		if(n==0) {
			num = "test";
		}
		try {
			int a = 10;
			System.out.println(3/n);
			System.out.println(num.charAt(0));
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("예외 발생");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
			
		//System.out.println(a);
		
		System.out.println("종료합니다.");
		
	}
}
