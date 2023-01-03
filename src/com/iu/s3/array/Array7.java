package com.iu.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		int [] ar = {5, 1, 4};
		int [] ar2 = new int[ar.length+1];
		int p=1;
		//1.데이터 추가 
			//0번 인덱스에 추가 
		//2.데이터 삭제 
			//0번 인덱스 삭제 
		//3.종료
		Scanner sc = new Scanner(System.in);
		System.out.println("1.데이터 추가 2.데이터 삭제 3.종료");
		int input = sc.nextInt();
		switch(input) {
		case 1:
			int input2 = sc.nextInt();
			for(int i=0;i<ar2.length;i++) {
				if(i==0) {
					ar2[i]=input2;
				}
				ar2[i] =ar[p];
				p++;
			}
			for(int i=0;i<ar2.length;i++) {
				System.out.println(ar2[i]);
			}
			
		case 2:
			
		default:
			break;
		}
		System.out.println("종료");
	}
}
