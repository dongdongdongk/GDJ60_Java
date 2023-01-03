package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {

	public static void main(String[] args) {
		//배그
		//총알 30발 - 1탄창
		//캐릭터당 - 3탄창
		
		//1. 단발
		//2. 점사
		
		//1번이면 "탕" 30번 반복 출력
		//2번이면 "타타탕" 10번 반복 출력
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("1.단발 2.점사 선택");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				for(int p=0;p<30;p++) {
					System.out.println("탕");
				}
				break;
			case 2:
				for(int g=0;g<10;g++) {
					System.out.println("타타탕");
				}
				break;
			}
		}
		System.out.println("종료");
	}
}
