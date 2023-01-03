package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {

	public static void main(String[] args) {
		//게임
		//1.로그인 될때까지
		//2.로그인 한 사용자만 게임 가능
		
		//-------------------로그인 파트---------------
		//1.로그인 2.종료
		//1: id,pw 입력후 로그인 판단 틀리면 로그인 판단 
		//2: 종료
		//--------------------진행파트----------------
		//1.로그인 성공 했을 때 진행
		//레벨 1로 시작 
		//초기 골드 0
		//5렙 달성시 1000골드 지급 (표시)
		//10렙 달성시 2000골드 지급
		//15렙 달성시 3000골드 지급 
		//모든 몬스터의 경험치는 동일
		//잡을때 마다 표시
		//레벨 오를때 표시 
		//1 -> 2 3
		//2 -> 3 6
		//3 -> 4 9
		//14 -> 15 52
		//15 종료
		//달성 축하 현재 골드 6000
		int id = 1234;
		int pw = 5678;
		int ids;
		int pws;
		int login;
		int gold = 0;
		int k =0;
		boolean logins = true;
		boolean idpws = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.로그인 2.종료");
		login = sc.nextInt();
		switch(login) {
		
		case 1:
			break;
		case 2:
			System.out.println("2.종료");
			break;
		}
		
		while(logins) {
			if(login==1) {
				System.out.println("id 입력");
				ids = sc.nextInt();
				System.out.println("pw 입력");
				pws = sc.nextInt();
				if(id==ids&&pw==pws) {
					idpws = true;
					System.out.println("로그인 성공");
					for(int i=1;i<=15;i++) {
						if(i%5==0) {
							int p=1;
							gold+=1000*p;
							p++;
							System.out.println(gold + "지급");
							System.out.println("레벨업");
						}
						for(int j=1;j<=k;k+=3) {
							System.out.println("몬스터 잡음");
						}
					}
				}else {
					System.out.println("id pw 오류");
				}
	
		
			System.out.println("15달성 현재골드 : " + gold);
		
		
		}
		
		
	System.out.println("종료합니다.");	
	}
	}
}
