package com.iu.s3.array;

public class Array1 {

	public static void main(String[] args) {
		//primitive type
		//숫자(정수형, 실수형), 문자, 논리형 
		//reference type
		
		int[] all = { 1, 2, 3, 4 };
		double d1 = 1.2;
		d1 = 5.3;
		
		if(d1>0) {
			int num = 10;
		}
		
		//배열선언 공식
		//모을려고 하는 데이터 타입 [] 변수명 
		double[] ar = {1.2, 5.2, 6,3};
		double[] ar2 = new double[2];
		ar2 = new double[] {1, 2, 3};
		int [] ar3 = new int[3];
		System.out.println(d1);
		System.out.println(ar);
		ar[0] = 3.3;
		ar[1] = 5.2;
		
		System.out.println(ar[0]);
		
		System.out.println(ar3[0]);
		
		int [] ar4 = {1,2,3,};
		
		for(int i=0;i<3;i++) {
			System.out.println(ar3[i]);
		}
		
		//heap 영역에 만들어 지는 변수는 자동으로 초기화가 진행된다.
		//로컬 변수는 개발자가 꼭 초기화를 시켜줘야 한다.
	}
}
