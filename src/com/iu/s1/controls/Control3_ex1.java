package com.iu.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int test = random.nextInt(5); // 0부터 5 미안의 정수 하나를 리턴
		int test2 = random.nextInt(30); // 0부터 30 미만의 정수 하나를 리턴 
		int test3 = random.nextInt(10);
		//Game : TRPG
		//법사
		String name = "핫팩";
		int hp = 20;
		int mp = 20;
		int maxHp;
		int maxMp;
		
		String monsterName = "오크";
		int monsterHp = 10;
		System.out.println("1.Hp");
		System.out.println("2.Mp");
		System.out.println("3.마법1");
		System.out.println("4.마법2");
		System.out.println("5.턴 넘기기");
		int ch = sc.nextInt();
		if(ch==1||ch==2) {
			maxHp = hp + test2;
			maxMp = hp + test2;
			if(maxHp>40) {
				maxHp = 40;
			}
			if(maxMp>40) {
				maxMp = 40;
			}
			System.out.println("Hp : " + maxHp);
			System.out.println("Mp : " + maxMp);
		}else if(ch==3) {
			System.out.println("마법1 외우기");
			mp-=3;
			if(test>=5) {
				System.out.println("크리티컬");
				monsterHp = monsterHp-test;
			}else {
				monsterHp = monsterHp-test;
			}
		}else if(ch==4) {
			System.out.println("마법2");
			mp-=5;
			if(test3>=10) {
				System.out.println("크리티컬");
				monsterHp = monsterHp-test;
			}else {
				monsterHp = monsterHp-test;
			}
		}else if(ch==5) {
			System.out.println("턴을 넘기기");
		}
		System.out.println("남은Hp: " + hp);
		System.out.println("남은mp: " + mp);
		System.out.println("남은 몬스터Hp: " + monsterHp);
		
	}
		
}
