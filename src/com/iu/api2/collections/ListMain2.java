package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {

	public static void main(String[] args) {
		int [] arr = new int [3];
		ArrayList ar= new ArrayList();
		
		//다형성 
		Integer num = 1;
		ar.add(num); //Auto-Boxing
		ar.add(1.2);
		ar.add('a');
		ar.add(false);
		ar.add("hello");
		ar.add(new Scanner(System.in));
		
		double n1 = (Double)ar.get(num);
		double n2 = (Double)ar.get(1);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}
}
