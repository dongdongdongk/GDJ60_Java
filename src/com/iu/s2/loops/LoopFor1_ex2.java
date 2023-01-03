package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생수 입력
		//학생수 만큼 점수 입력 받아서 
		//총합계
//		int sum = 0;
//		System.out.println("학생수 입력");
//		int sn = sc.nextInt();
//		for(int i=1;i<=sn;i++) {
//			System.out.println("학생점수 입력");
//			int sp = sc.nextInt();
//			sum+=sp;
//		}
//		System.out.println("총합계 : " + sum);
		System.out.println("초를 입력하세요");
		int s =sc.nextInt();
		for(int i=0;i<60;i++) {
			System.out.println(i + "초");
			if(i>s-1) {
				i+=60;
			}
			
		}
		System.out.println("종료");
	}
}
