package com.iu.api1.Strings;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
	
		String str = new String("abcdefera");
		String str2 = "abc";
		
		System.out.println(str==str2);
		
		boolean check = str.equals(str2);
		System.out.println(check);
		
		
		System.out.println(str2.charAt(2));
		char test = str2.charAt(1);
		System.out.println(test);
		
		boolean check2 = str.contains(str2);
		System.out.println(check2);
		
		
		Scanner sc = new Scanner(System.in);
		//char ch = sc.next().charAt(0);
		
		
		int b = str.indexOf(test);
		System.out.println(b);
		
	}
}
