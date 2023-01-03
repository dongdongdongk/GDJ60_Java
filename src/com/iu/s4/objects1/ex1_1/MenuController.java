package com.iu.s4.objects1.ex1_1;

import java.util.Scanner;

public class MenuController {
	
	
	//start
	//1. 등록
	//2. 수정
	//3. 삭제
	//4. 종료
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		StudentInput si = new StudentInput();
		StudentView sv = new StudentView();
		
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		Student [] students = new Student[count];
		
		
		while(check) {
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 검색 정보 출력");
			System.out.println("3.학생 전체 정보 출력");
			System.out.println("4.종료");
			int select=sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("등록입니다");
				si.setAllStudents(students);
				break;
			case 2:
				Student student = si.findStudent(students);
				if(student != null) {
					sv.view(student);
				}else {
					System.out.println("그런 학생은 없다.");
				}
				break;
			case 3:
				sv.view(students);
				break;
			default:
				System.out.println("종료합니다");
				check=false;
				break;
			}
			
		}
		
		
		
	}
	
	

}