package com.iu.s4.objects3.p1;

public class Member {

	//비만관리 회원등록
	String name;
	private int age;
	private double ki;
	private double muge;
	private boolean check;

	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public Member() {
		
	}
	public Member(int age) {
		if(age>0 || age<200) {
			this.age=age;
		}
	}
	public void setAge(int age) {
		this.age = age;
		if(age>0 && age < 200) {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
	public void info() {
		System.out.println("Name : " + this.name);
		System.out.println("Age :" + this.age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getKi() {
		return ki;
	}
	public void setKi(double ki) {
		this.ki = ki;
	}
	public double getMuge() {
		return muge;
	}
	public void setMuge(double muge) {
		this.muge = muge;
	}
	
}
