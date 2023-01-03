package com.iu.s4.objects1.ex1;

import com.iu.s4.objects1.Sword;

public class MethodTest3 {
	
	public void t3(int salary, Double tax) { 
		//실급여를 계산하는 메서드 
		salary =(int)(salary*tax);
		System.out.println(salary*tax);
		
	}
	
	public void info(Sword sword) {
		System.out.println(sword.name);
		System.out.println(sword.at);
		//Sword 모든 정보를 출력
		//받아서 출력
	}
	
}
