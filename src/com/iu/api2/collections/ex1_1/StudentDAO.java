package com.iu.api2.collections.ex1_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	
	private StringBuffer sb;
	private Scanner sc;
	
	public StudentDAO() {
		this.sc=new Scanner(System.in);
		this.sb=new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
	}
	
	//학생정보백업
	//현재시간을 파일명으로 해서 파일작성
	public void studentBackUp(ArrayList<StudentDTO> ar) {
		Calendar ca = Calendar.getInstance();
		long time = ca.getTimeInMillis();
		
		File file = new File("C:\\fileTest",time+".txt"); 
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			for(StudentDTO studentDTO : ar) {
				StringBuffer sb = new StringBuffer();
				sb.append(studentDTO.getName());
				sb.append("-");
				sb.append(studentDTO.getNum());
				sb.append("-");
				sb.append(studentDTO.getKor());
				sb.append("-");
				sb.append(studentDTO.getEng());
				sb.append("-");
				sb.append(studentDTO.getMath());
				sb.append("\r\n");
				
				fw.write(sb.toString());
				fw.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath() );
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		ar.add(studentDTO);
		
		
	}
	
	//학생정보검색
	public StudentDTO findByName(ArrayList<StudentDTO> ar) {
		System.out.println("검색할 이름 입력");
		String name = sc.next();
		
		StudentDTO st=null;
		
		for(StudentDTO studentDTO:ar) {
			if(name.equals(studentDTO.getName())) {
				st = studentDTO;
				break;
			}
		}
		
		return st;
	}
	
	
	//학생정보초기화
	public ArrayList<StudentDTO>  init() {
		
		File file = new File("C:\\fileTest", "student.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		
		String data = null;
		while((data=br.readLine())!=null) {
			
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			br.close();
			}catch (Exception e) {
				
			}
		}
		
		
		
		
		
		String data = this.sb.toString();
		data=data.replace(" ", "-");
		data=data.replace(",", "");
		
		System.out.println(data);
		StringTokenizer st = new StringTokenizer(data, "-");
		ArrayList<StudentDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath() );
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);
		}
		
		return ar;
	}
}
