package com.iu.s4.objects1;

import com.iu.s4.objects1.ex1.MethodTest3;

public class MethodMain1 {

	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		MethodTest3 mt3 = new MethodTest3();
		Sword sword = new Sword();
		
		sword.name = "집행검";
		sword.at = 500;
		
		mt3.info(sword);
		System.out.println(sword.name);
		System.out.println(sword.at);
		
		
		
		int salary = 3000000;
		//호출시 매개변수로 보내는 값 : 인자값
		
		System.out.println("Main Method 실행");
		//메서드를 호출한다
		//mt.t1();
		mt3.t3(salary, 0.95); 
		
			
		System.out.println("main : " + salary);
		System.out.println("Main Method 종료"); 
		
		//mt.t2();
	}
}
