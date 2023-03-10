package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		//순서유지, 값의 중복 허용, 배열기반 
		int [] arr = new int [3];
		ArrayList ar = new ArrayList();
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.remove(1);
		ar.set(2, 9);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("===================================");
		
		ar.add(3,8);
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}
}
