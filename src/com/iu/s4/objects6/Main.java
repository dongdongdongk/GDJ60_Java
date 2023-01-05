package com.iu.s4.objects6;

public class Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Robot robot = new Robot();
		ArmLeft armLeft = new ArmLeft();
		//약한연결 robot 이 사라져도 살아남음  
		
		robot.setArmLeft(armLeft);
		System.out.println(robot.getArmLeft());
		System.out.println("Right :" + robot.getArmRight());
		//Armright 하고 robot 은 강한연결 ( robot 이 사라지면 사라짐)
		robot = null;
		
		System.out.println("프로그램 종료");
		System.out.println("AddRobot에서 작업");
		robot = new Robot();
		System.out.println(robot);
		//외부에서 객체를 만들어서 집어넣기 (약한결합) 
		//내부에서 객체를 만들어서 넣기 
		
	}
}
