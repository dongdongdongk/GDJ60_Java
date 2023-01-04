package com.iu.s4.objects3.p2;

import com.iu.s4.objects3.p1.Secret;

public class SecreatMain {

	public static void main(String[] args) {
		Secret secret = new Secret();
		
		secret.money = 1;
		
		secret.s1();
		
		System.out.println(secret.point);
		Test test = new Test();
		System.out.println(test.point);
	}
}
