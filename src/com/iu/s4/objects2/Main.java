package com.iu.s4.objects2;

public class Main {

	public static void main(String[] args) {
		
		ReturnTest returnTest = new ReturnTest();
		
		returnTest.t1();
		int num = returnTest.t2();
		System.out.println(num);
		
		int [] ar= returnTest.t3();
		for(int i=0;i<4;i++) {
			System.out.println(ar[i]);
		}
		
	}
}
