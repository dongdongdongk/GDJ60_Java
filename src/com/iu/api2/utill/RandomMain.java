package com.iu.api2.utill;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		
		//1000원 로또 구매 1-45 6자리 뽑기 
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		
		
		
		while(ar.size()<6) {	
			int num = random.nextInt(44)+1;
			if(ar.contains(num))
				continue;
				else {
					ar.add(num);
				}		
		}
		System.out.println(ar);
		
		
		
		
		
		
	}
}
