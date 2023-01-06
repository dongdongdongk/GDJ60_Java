package com.iu.api1.Strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg","jpeg", "gif","png"};
		System.out.println("파일명을 입력");
		String fileName = sc.next(); //dfadfa.jpg 4개중하나면 정상아니면 아니다 출력
		boolean check;
		int sp = fileName.indexOf('.');
		String sp2 = fileName.substring(sp+1);
		System.out.println(sp2);
		
		for(int i=0;i<4;i++)
			if (names[i].equals(sp2)) {
				System.out.println("정상");
				check = true;
				break;
			}else {
				break;
			}
			
		
		
		
//		if(sp2.equals(names)) {
//			System.out.println("정상");
//		}else {
//			System.out.println("정상 아님");
//		}
	}
}
