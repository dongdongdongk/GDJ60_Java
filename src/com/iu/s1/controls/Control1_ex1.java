package com.iu.s1.controls;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		//키보드로 부터 국어, 영어, 수학 점수 입력 받음
		//총점 과 평균 계산 
		//평균이 90점 이상이면 A를 출력 
		//평균이 80점 이상이면 B를 출력 
		//평균이 70점 이상이면 C를 출력 
		//평균이 나머지 F를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력");
		int k = sc.nextInt();
		System.out.println("영어 점수 입력");
		int e = sc.nextInt();
		System.out.println("수학 점수 입력");
		int m = sc.nextInt();
		int sum = k+e+m;
		double avg = sum/3;
		char total;
		if(avg>=90) {
			System.out.println("점수는 A");
		} else if(avg>=80) {
			System.out.println("점수는 B");
		} else if(avg>=70) {
			System.out.println("점수는 C");
		} else {
			System.out.println("점수는 F");
		}
		
		//출력문을 한번만 사용 
		if(avg>=90) {
			total = 'A';
		} else if(avg>=80) {
			total = 'B';
		} else if(avg>=70) {
			total = 'C';
		} else {
			total = 'F';
		}
		System.out.println("점수는 " + total );
	}
}
