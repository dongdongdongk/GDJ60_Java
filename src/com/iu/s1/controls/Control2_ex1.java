package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {
 
	public static void main(String[] args) {
		//회원가입 할 때 입력한 ID, PW
		int id = 1234;
		int pw = 5678;
		
		//키보드로 부터 id, pw 를 입력 받아서 로그인 처리(성공, 실패)
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력");
		int id2 = sc.nextInt();
		System.out.println("비밀번호 입력");
		int pw2 = sc.nextInt();
		
		if(id==id2&&pw==pw2) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}

