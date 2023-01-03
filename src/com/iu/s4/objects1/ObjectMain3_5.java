package com.iu.s4.objects1;

import java.util.Scanner;

public class ObjectMain3_5 {

	public static void main(String[] args) {
		//n명의 학생 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력");
		int count = sc.nextInt();
		
		
		Student [] students = new Student[count]; //객체를 만들 배열
		Student [] students2 = new Student[count];
			
		for(int i=0;i<students.length;i++) {
			Student st = new Student();
			System.out.println(i+1+"번째 학생의 이름 입력");
			st.name = sc.next();
			students[i] = st;
			System.out.println(st);
		}
		
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
			System.out.println(students[i].name);
			//System.out.println(students2[i].name); //
		}
		System.out.println("종료");
	}
}
