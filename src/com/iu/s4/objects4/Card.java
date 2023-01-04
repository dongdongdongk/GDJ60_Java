package com.iu.s4.objects4;

public class Card {

	//Card
	private String shape;
	private int number;
	private String color;
	//
	public static int size = 10;
	
	//instance 초기화 블럭
	{}
	
	//static 초기화 블럭 
	static { 
		Card.size = 50;
	}
	
	//클래스 메서드 
	
	public static void staticMethod() {
		Card.size = 10;
		System.out.println("Static Mehtod");
		Card card = new Card();
		System.out.println(card.shape);
		card.info();
	}
	
	public void info() {
		System.out.println("Shape :" + this.shape);
		System.out.println("Color :" + this.color);
		System.out.println("Number :" + this.number);
		System.out.println("Size :" + Card.size);
		Card.staticMethod();
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
