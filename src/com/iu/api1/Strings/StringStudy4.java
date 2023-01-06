package com.iu.api1.Strings;

public class StringStudy4 {

	public static void main(String[] args) {
		String str = "StarWars";
		
		String result = str.substring(4);
		System.out.println(result);
		
		
		String result2 = str.substring(4,6);
		System.out.println(result2);
		
		str = "dhk9309@naver.com";
//		String result3 = str.substring(5);
//		System.out.println(result3);
	
		int temp = str.indexOf('@');
		
		String result3 = str.substring(temp+1);
	System.out.println(result3);
	
	}
}
