package com.iu.s1.controls;

public class Control4 {

	public static void main(String[] args) {
		int num = 3;
		System.out.println("1. 햄버거");
		System.out.println("2. 샌드위치");
		System.out.println("3. 샐러드");
		
		switch(num) {
		case 1:
			System.out.println("1번 선택");
			break;
		case 2:
			System.out.println("2번 선택");
			break;
		case 3: 
			System.out.println("3번 선택");
			break;
		default :
			System.out.println("그외 나머지");
			break;
			
		}
	}
}
