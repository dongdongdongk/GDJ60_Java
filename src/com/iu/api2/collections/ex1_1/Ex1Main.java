package com.iu.api2.collections.ex1_1;

import java.io.File;
import java.util.ArrayList;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐
		//1. 학생정보초기화
		//2. 학생정보전체조회
		//3. 학생정보검색조회(이름)
		//4. 학생정보추가
		//5. 학생정보삭제(이름)
		//6. 프로그램종료

		//학생정보 백업
		//현재시간을 파일명으로 해서 파일작성 
		new StudentController().start();
		
//		File file = new File("C:\\fileTest", "a.txt");
		
		
		//향상된 for
//		for(StudentDTO studentDTO:ar) {
//			
//		}
//		int [] nums = new int [3];
//		for(int n:nums) {
//			
//		}

	}
}
