package com.iu.s3.array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
//		int [] ar = {8, 5, 13, 9, 6};
//		int [] ar2 = new int [ar.length-1];
//		//아무거나 선택해서 삭제 출력 
//		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		
//		
//		for(int i=0;i<ar.length-1;i++) {
//			if(input==ar[i]) {
//				ar2[i]=ar[i+1];
//			}
//			ar2[i]=ar[i];
//		}
//		for(int i=0;i<ar2.length;i++) {
//			System.out.println(ar2[i]);
//		}
		Scanner sc = new Scanner(System.in);
		int[] ar = {8, 5, 13, 9 , 6};
		int idx = 0;
		System.out.println("삭제할 숫자 입력");
		int delete = sc.nextInt();
		
		int [] copy = new int [ar.length-1];
		
		int p=0;
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]==delete) {
				continue;
			}
			copy[idx] = ar[i];
			idx++;
		}
		for(int i=0;i<copy.length;i++) {
			System.out.println(copy[i]);
		}
	}
}
