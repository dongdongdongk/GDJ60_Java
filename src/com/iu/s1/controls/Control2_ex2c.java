package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex2c {

	public static void main(String[] args) {
		//평균 60점 이상인가?
		//과목당 40점 미안이면 불합격
		//합격 불합격 출력 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력");
		int k = sc.nextInt();
		System.out.println("영어 점수 입력");
		int e = sc.nextInt();
		System.out.println("수학 점수 입력");
		int m = sc.nextInt();
		int sum = k+e+m;
		double avg = sum/3;
		
		if(k<40||e<40||m<40&&avg<=60) {
			System.out.println("불합격");
		} else {
			System.out.println("합격");
		}
	}
}
