package com.iu.s4.objects1.ex1_1;

public class StudentView {
	//viewList
	//N명의 학생들을 받아서 학생의 모든 정보를 출력
	public void view(Student [] students) {
		for(int i=0;i<students.length;i++) {
			Student student = students[i];
			//System.out.println(student[i].name);
			this.view(student);
		}
		
		
	}
	
	//viewOne
	//학생 한명을 받아서 학생의 모든 정보를 출력
	public void view(Student student) {
		System.out.println("Name : "+student.name);
		System.out.println("Num : "+student.num);
		System.out.println("Kor : "+student.kor);
		System.out.println("Eng : "+student.eng);
		System.out.println("Math : "+student.math);
		System.out.println("Total : "+student.total);
		System.out.println("Avg : "+student.avg);
	}
	

}