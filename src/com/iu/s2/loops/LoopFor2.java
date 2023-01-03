package com.iu.s2.loops;

public class LoopFor2 {

	public static void main(String[] args) {
		//반복문의 보조문
		//1. break
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("반복문 종료");
		
		//2. continue
	}
}
