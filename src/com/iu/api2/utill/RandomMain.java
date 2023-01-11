package com.iu.api2.utill;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
//		Random random = new Random();
//		
//		//1000원 로또 구매 1-45 6자리 뽑기 
//		ArrayList<Integer> ar = new ArrayList<Integer>();	
//		while(ar.size()<6) {	
//			int num = random.nextInt(44)+1;
//			if(ar.contains(num))
//				continue;
//				else {
//					ar.add(num);
//				}		
//		}
//		System.out.println(ar);
		Random random = new Random();
		
		//2.set
		HashSet<Integer> hs = new HashSet<>();
		
		while(hs.size()<6) {
		
			hs.add(random.nextInt(45)+1);
		}
		
		System.out.println(hs);
		
		
		
		
		
		
//		int num = random.nextInt(9)+1;
//		
//		//1.배열
//		int[] nums = new int [6];
//		ArrayList<Integer> ar = new ArrayList<>();
//		
//		while(ar.size()<6) {
//			
//		}
		
//		for(int i=0;i<nums.length;i++) {
//			nums[i] = random.nextInt(45)+1;
//			for(int j=0;j<i;j++) {
//				if(nums[i]==nums[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		for(int i=0;i<nums.length;i++) {
//			System.out.println(nums[i]);
//			
//		}	
		
		
	}
}
