package com.iu.s4.objects2;

public class Car {
	
	static String company = "Bmw";
	String name;
	int price;
	String color;
	
	public Car() {
		System.out.println("생성자 ");
		this.company = "KIA";
		this.name = "스포티지";
		this.price = 3500;
		this.color = "Black";
	}
//	public Car(String color) {
//		this(color,3500);
////		this.company = "KIA";
////		this.name = "스포티지";
////		this.price = 3500;
////		this.color = color;
//	}
	{
		//초기화 블럭
		System.out.println("초기화 블럭 :" + this.company);
		this.company = "AUDI";
	}
	public Car(int price, String color) {
		this.company = "KIA";
		this.name = "스포티지";
		this.price = price;
		this.color = "White";
	}
		
	public void info() {
		System.out.println("Name : " + this.name);
		System.out.println("Company : " + this.company);
		System.out.println("Price : " + this.price);
		System.out.println("Color : " + this.color);
		
	}
	public Car(String color, int price, String name) {
//		this.company = "Kia";
//		this.price = price;
//		this.color = color;
	}
}
