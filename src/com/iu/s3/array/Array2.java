package com.iu.s3.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
	
		//키보드로 부터 숫자를 입력 받아서 해당 숫자 만큼 배열을 생성 
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int [] arr = new int[input];
		
		for(int i=0;i<input;i++) {
			int input2 =sc.nextInt();
			arr [i] = input2;
		}
		for(int i=0;i<input;i++) {
			System.out.println("arr[" + arr[i]);
		}
		
	}
}
