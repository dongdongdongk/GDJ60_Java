package com.iu.s4.objects1;

public class ObjectsMain {

	public static void main(String[] args) {
		System.out.println("Start");
		//main은 프로그램을 실행 목적
		//Test 목적
		//main 은 어느 클래스 안에 있던지 상관 없음
		
		//학생 한명 생성
		//객체 생성
		//변수 선언과 거의 동일 
		//클래스명 변수명 = new 클래스명();
		Student st = new Student();
		//st.name = "test";
		st.num = 20;
		System.out.println(st.name);
		System.out.println(st.num);
		System.out.println(st.avg);
		System.out.println(st);
		
		Student st2 = new Student();
		st2.name = "iu";
		st2.num = 30;
		
		System.out.println(st==st2);
		System.out.println(st2.name);
		System.out.println(st2.num);
		System.out.println(st2.avg);
		System.out.println(st2);
		
		System.out.println("finish");
		
		//학생객체 생성
		
		st = st2;
		System.out.println(st.name); 
	
		
	}
}
