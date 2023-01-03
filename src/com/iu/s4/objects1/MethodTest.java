package com.iu.s4.objects1;

public class MethodTest {

	//메서드 선언 공식
	//public static void main(String [] args){}
	//접근지정자 [그외지정자] 리턴타입 메서드명 (매개변수들 선언) {}
	
	//접근 지정자 : public 
	//그외 지정자 : 생략
	//러턴 타입 : void
	//메서드명 : 작명
	
	public void t1() { //메서드의 header , 선언부
		//{}메서드의 body , 내용
		//제어문, 반복문, 등등등
		System.out.println("t1 메서드 실행시작");
		MethodTest2 mt2 = new MethodTest2();
		mt2.inof();
		int num = 10;
		
		System.out.println("T1Num :" + num);
		System.out.println("t1 메서드 종료");
	}
	
	public void t2() {
		System.out.println("t2 메서드 실행");
		int num = 20;
		System.out.println("t2 메서드 종료");
	}
}
