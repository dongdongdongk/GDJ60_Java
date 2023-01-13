package com.iu.s4.api3network.ex.clients;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	
	private StringBuffer sb;
	private Scanner sc;
	private String nwd;
	
	public StudentDAO() {
		this.sc=new Scanner(System.in);
		this.sb=new StringBuffer();
	}
	
		public ArrayList<StudentDTO> init(String data) {
			data=data.replace(" ", "-");
			StringTokenizer st = new StringTokenizer(data, "-");
			ArrayList<StudentDTO> ar = new ArrayList<>();
			while(st.hasMoreTokens()) {
				StudentDTO studentDTO = new StudentDTO();
				studentDTO.setName(st.nextToken());
				studentDTO.setNum(Integer.parseInt(st.nextToken()));
				studentDTO.setKor(Integer.parseInt(st.nextToken()));
				studentDTO.setEng(Integer.parseInt(st.nextToken()));
				studentDTO.setMath(Integer.parseInt(st.nextToken()));
				ar.add(studentDTO);
			}
			return ar;
		}

	
	//학생정보삭제
	public int removeStudent(ArrayList<StudentDTO> ar) {
		//삭제확인용 변수
		//0이면 삭제 실패, 1 이면 삭제 성공
		int result=0;
		
		System.out.println("삭제할 이름 입력");
		String name = sc.next();
		//ar.remove(인덱스번호)
		//ar.remove(Object)
//		for(int i=0;i<ar.size();i++) {
//			if(name.equals(ar.get(i).getName())) {
//				ar.remove(i);
//				result=1;		
//				break;
//			}
//			
//		}
		for(StudentDTO studentDTO:ar) {
			if(name.equals(studentDTO.getName())) {
				ar.remove(studentDTO);
				result=1;
				break;
			}
		}
		
		return result;
		
	}
	
	//학생정보추가
	public void addStudent(ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("이름을 입력");
		studentDTO.setName(sc.next());
		System.out.println("번호를 입력");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어점수를 입력");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어점수를 입력");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학점수를 입력");
		studentDTO.setMath(sc.nextInt());
		ar.add(studentDTO);
		
		
	}
	
	public String addStudent2() {
		
		String si;
		System.out.println("이름을 입력");
		si = sc.next();
		System.out.println("번호를 입력");
		si = si + "-" +sc.next();
		System.out.println("국어점수를 입력");
		si = si + "-" +sc.next();
		System.out.println("영어점수를 입력");
		si = si + "-" +sc.next();
		System.out.println("수학점수를 입력");
		si = si + "-" +sc.next();
		System.out.println(si);
		return si;
	}

}
