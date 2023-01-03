package com.iu.s3.array;

public class Array8 {
	public static void main(String[] args) {
		int [] ar = {9, 5, 8, 3, 6 ,10 ,56 , 43};
		
		//9,8,6,5,3 출력 
		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-1-i;j++) {
				if(ar[j] < ar[j+1]) {
					int tmp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = tmp;
				}
			}
				
		}
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
			
	}
	
}
