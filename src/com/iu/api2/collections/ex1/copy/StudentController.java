package com.iu.api2.collections.ex1.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

	private Scanner sc;
	
	//의존성
	private StudentDAO studentDAO;
	private StudentView studentView;
	private ArrayList<StudentDTO> ar;
	
	public StudentController() {
		sc = new Scanner(System.in);
		studentDAO = new StudentDAO(); //주입
		studentView = new StudentView(); // 의존성 주입(DI)
	}
	
	public void start() {
		boolean check = true;
		//1. 학생정보 초기화 
		//2. 학생정보 전체조회 
		//3. 학생정보 검색조회(이름)
		//4. 학생정보추가
		//5. 학생정보삭제(이름)
		//6. 학생정보를 빽업
		while(check) {
			System.out.println("1.학생정보 초기화");
			System.out.println("2.학생정보 전체조회");
			System.out.println("3.학생정보 검색조회");
			System.out.println("4.학생정보 추가");
			System.out.println("5.학생정보 삭제");
			System.out.println("6.프로그램 종료 ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				ar = studentDAO.intit();
				break;
			case 2:
				studentView.view(ar);
				break;
			case 3:	
				StudentDTO studentDTO = studentDAO.findByName(ar);
				if(studentDTO !=null) {
					studentView.view(studentDTO);
				}else {
					studentView.view("찿는학생이 없다");
				}
				break;
			
		case 4:
			studentDAO.addStudent(ar);
			break;
			
		case 5:
			select = studentDAO.removeStudent(ar);
			if(select==1) {
				
			}
		}
		
		}
	}
}
