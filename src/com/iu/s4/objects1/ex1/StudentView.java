package com.iu.s4.objects1.ex1;


public class StudentView {

	//viewOne 메서드 
	//학생 한명을 받아서 학생의 모든 정보를 출력
	
	//viewList
	//학생들을 받아서 학생의 모든 정보를 출력 
	
	
	public void viewOne(Student student) {
		System.out.println("Name : " + student.name);
		System.out.println("Num : " + student.num);
		System.out.println("Kor : " + student.kor);
		System.out.println("Eng : " + student.eng);
		System.out.println("Math : " + student.math);
		System.out.println("Total : " + student.total);
		System.out.println("Avg : " + student.avg);
	}
	
	public void viewList(Student [] students) {
		
		for(int i=0;i<students.length;i++) {
//			System.out.println("Name : " + students[i].name);
//			System.out.println("Num : " + students[i].num);
//			System.out.println("Kor : " + students[i].kor);
//			System.out.println("Eng : " + students[i].eng);
//			System.out.println("Math : " + students[i].math);
//			System.out.println("Total : " + students[i].total);
//			System.out.println("Avg : " + students[i].avg);
			
			Student student = students[i];
			System.out.println("Name : " + student.name);
			System.out.println("Num : " + student.num);
			System.out.println("Kor : " + student.kor);
			System.out.println("Eng : " + student.eng);
			System.out.println("Math : " + student.math);
			System.out.println("Total : " + student.total);
			System.out.println("Avg : " + student.avg);
		}
		
		
	}
}
