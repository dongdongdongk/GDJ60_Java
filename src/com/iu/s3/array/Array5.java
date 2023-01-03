package com.iu.s3.array;

public class Array5 {

	public static void main(String[] args) {
//		int [] ar1 = {1,2,3};
//		int [] ar2 = {1,2};
//		ar1 = ar2;
//		
//		for(int i=0;i<ar1.length;i++) {
//			System.out.println(ar1[i]);
//		}
		int [] ar1 = {1,2,3};
		
		int [] copy = new int[ar1.length-1];
		for(int i=0;i<copy.length;i++) {
			copy[i]=ar1[i];
		}
		ar1=copy;
	}
}
