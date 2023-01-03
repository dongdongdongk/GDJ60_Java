package com.iu.s4.objects2;

import java.util.Random;

public class ReturnTest {

	public void t1() {
		System.out.println("return이 없을때는 void");
	}
	
	public int t2() {
		Random random = new Random();
		System.out.println("return 은 int");
		return random.nextInt(50);
	}

	public int[] t3() {
		int[] ar = {1,2,3,4};
		return ar; 
	}

}
