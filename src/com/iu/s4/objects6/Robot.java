package com.iu.s4.objects6;

public class Robot {

	//field
	//Robot 클래스는 armLeft,Right 에 의존적이다 (dependency) Injection(주입)
	private ArmLeft armLeft;    // 의존성 주입 
	private ArmRight armRight;
	
	//Constructor
	
	public Robot() {
		this.armRight = new ArmRight();
	}
	public Robot(ArmRight armRight) {
		
	}
	
	//method
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	public ArmRight getArmRight() {
		return armRight;
	}
	public void setArmRight(ArmRight armRight) {
		this.armRight = armRight;
	}
	
	
}
