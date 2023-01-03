package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
	
	//start 메서드
	//1. 등록
	//2. 수정
	//3. 삭제 
	//4. 종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		Student [] students = new Student[count];
		Studentinput sinput = new Studentinput();
		
		while(check) {
			int input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.println("1.등록");
				sinput.setAllStudents(students);
				break;
			case 2:
				System.out.println("2.수정");
				break;
			case 3:
				System.out.println("3.삭제");
				break;
			default :
				System.out.println("4.종료");
				check = false;
				break;
			}
			
			
		}
	}
	
}
