package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복문 횟수를 입력하세요");
		int input = sc.nextInt();
		
		for(int i=1;i<=input;i++) {
		System.out.println("Hello World");
		System.out.println("Good Bye");
		}
		
	}
}
