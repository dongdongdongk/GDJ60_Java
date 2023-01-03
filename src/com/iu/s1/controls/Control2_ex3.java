package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//회원가입 할 때 입력한 ID, PW
		int id = 1234;
		int pw = 5678;
		boolean s;
		//로그인 성공 했을 때만 실행
		//급여를 입력
		//정규직이면 1을, 계약직이면 2를 입력
		//실급여 계산
		//정규직 : 고용보험 2%,의료보험3% 국민연금 1%, 산재보험 1%
		//계약직 : 원천징수 3.3%
		//실급여 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력");
		int id2 = sc.nextInt();
		System.out.println("비밀번호 입력");
		int pw2 = sc.nextInt();
		
		if(id==id2&&pw==pw2) {
			System.out.println("로그인 성공");
			s = true;
		} else {
			System.out.println("로그인 실패");
			s = false;
		}
		
		if(s) {
			System.out.println("실급여 입력");
			int pay = sc.nextInt();
			System.out.println("정규직 : 1 or 계약직 : 2");
			int ftime = sc.nextInt();
			
			double tx;
			
			if(ftime==1) {
				tx = pay*0.07;
				pay = pay-(int)tx;
				System.out.println("고용형태 : 정규직 \n급여 : " + pay);
			} else {
				tx = pay*0.033;
				pay = pay -(int)tx;
				System.out.println("고용형태 : 계약직 \n급여 : " + pay);
				
			}
		}
	
	}
}

