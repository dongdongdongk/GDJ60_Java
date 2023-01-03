package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class Studentinput {
	
	//findStudent
	//학생배열을 받아서 
	//학생의 번호를 입력받아서 일치하는 학생을 리턴 없으면 null
	public int[] findStudent() {
		
	}
	
	
	public void setStudent() {
		Student st = new Student();
		Scanner sc = new Scanner(System.in);
 
		System.out.println("이름 입력");
		String sinput = sc.next();
		st.name = sinput;
		
		System.out.println("번호 입력");
		st.num = sc.nextInt();
		System.out.println("국어 입력");
		st.kor = sc.nextInt();
		System.out.println("영어 입력");
		st.eng = sc.nextInt();
		System.out.println("수학 입력");
		st.math = sc.nextInt();
		
		int sum = st.kor + st.eng + st.math;
		double avg = sum/3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
		
		public void setAllStudents(Student [] students) {
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<students.length;i++) {
				Student st = new Student();
				
				System.out.println("이름 입력");
				String sinput = sc.next();
				st.name = sinput;
				
				System.out.println("번호 입력");
				st.num = sc.nextInt();
				System.out.println("국어 입력");
				st.kor = sc.nextInt();
				System.out.println("영어 입력");
				st.eng = sc.nextInt();
				System.out.println("수학 입력");
				st.math = sc.nextInt();
				
				int sum = st.kor + st.eng + st.math;
				double avg = sum/3;
				
				System.out.println("총점 : " + sum);
				System.out.println("평균 : " + avg);
				
				students[i] = st;
			}
		
		
	}
}
	//setStudent
	//학생 한명을 객체를 생성해서, 이름, 번호, 국어, 영어, 수학 입력
	//총점 평균
	
	
	//setAllStudents
	//매개변수로 학생배열을 받아서 
	//배열의 수만큼 학생 객체를 생성해서 이름,번호...
	//총점 평균
	//학생 객체를 배열에 대입

