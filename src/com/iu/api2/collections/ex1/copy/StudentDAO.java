package com.iu.api2.collections.ex1.copy;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	
	private StringBuffer sb;
	private Scanner sc;
	
		
	public StudentDAO() {
		this.sb = new StringBuffer();
		this.sc = new Scanner(System.in);	
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
						
		}
	//학생정보삭제 
	public int removeStudent(ArrayList<StudentDTO>ar) {
		//삭제확인용 변수
		//0이면 삭제 실패, 1이면 삭제 성공 
		int result = 0;
		System.out.println("삭제할 이름 입력");
		String name = sc.next();
		//ar.remove(인덱스 번호) 인덱스 번호가 필요하여 향상된 for사용 불가능
		//ar.remove(Object) 오브젝트를 사용하여 향상된 for로 삭제도 가능

		//인덱스로 지우기 
//		for(int i=0;i<ar.size();i++) {
//			if(name.equals(ar.get(i).getName())) {
//				ar.remove(i);
// 				result = 1;
//				break;
//			}
//		}
		for(StudentDTO studentDTO:ar) {
			if(name.equals(studentDTO.getName())) {
				ar.remove(studentDTO);
				result = 1;
				break;
			}
		}
		return result;
	}
	
	
	
	
	
	
	//학생정보추가 
	public void addStudent(ArrayList<StudentDTO>ar) {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("이름을 입력");
		studentDTO.setName(sc.next());
		System.out.println("번호를 입력");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어점수 입력");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어점수 입력");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학점수 입력");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		ar.add(studentDTO);
	}
	
	
	
	//학생정보검색
	public StudentDTO findByName(ArrayList<StudentDTO> ar) {
		System.out.println("검색할 이름 입력");
		String name = sc.next();
		
		StudentDTO st = null;
		for(StudentDTO studentDTO:ar) {
			if(name.equals(studentDTO.getName())) {
				st = studentDTO;
				break;
			}
		}
		return st;
	}
	
	
	
	
	
		//학생정보초기화 
	public ArrayList<StudentDTO> intit() {
		String data = this.sb.toString();
		ArrayList<StudentDTO> ar = new ArrayList<>();
		data = data.replace(" ", "-");
		data = data.replace(",", "");
		StringTokenizer st = new StringTokenizer(data, "-");
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);
		}
		return ar;

	}
	
}
