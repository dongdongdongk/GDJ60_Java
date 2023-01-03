package com.iu.s3.array;

import java.util.Scanner;

public class Array7_5 {
	
	public static void main(String[] args) {
		int s = 0;
		int [] ar = {5,1,4};
		Scanner sc = new Scanner(System.in);
		while(true) {
			int [] ar2 = new int [ar.length+1];
			System.out.println("데이터 추가");
			int ainput = sc.nextInt();
			System.arraycopy(ar, 0, ar2, 1, ar.length);
			ar2[0] = ainput;
			
			for(int i=0;i<ar2.length;i++) {
				System.out.println(ar2[i]);
			}
		}
		
		
		
	}
}
