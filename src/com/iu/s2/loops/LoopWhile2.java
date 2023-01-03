package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(true) {
			System.out.println("1.짜장 2.짬뽕 3.탕수육 4.프로그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("짜장 선택");
				break;
			case 2:
				System.out.println("짬뽕 선택");
				break;
			case 3:
				System.out.println("탕수육을 먹겠다");
				break;
			default :
				System.out.println("종료");
				break;
				
			}
			break;
		}
		System.out.println("프로그램 종료");
	}
}
