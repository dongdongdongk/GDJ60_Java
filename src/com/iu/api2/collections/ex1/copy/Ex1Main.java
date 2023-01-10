package com.iu.api2.collections.ex1.copy;

public class Ex1Main {

	public static void main(String[] args) {
		//학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐 
		//1. 학생정보 초기화 
		//2. 학생정보 전체조회 
		//3. 학생정보 검색조회(이름)
		//4. 학생정보추가
		//5. 학생정보삭제(이름)
		
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.init();
		//프로그램 시작을 메인에서 하지말고 컨트롤러 만들고 초기화 등은 DAO 출력은 view 에서 
	}
}
