package com.iu.api1.Strings;

public class StringStudy2 {

	public static void main(String[] args) {
		String email = "d@hk9309@gmail.com";
		int idx = email.lastIndexOf("@");
		System.out.println(idx);
		
		System.out.println(email.length());
		for(int i=0;i<email.length();i++) {
			char temp = email.charAt(i);
			System.out.println(temp);
		}
		System.out.println("Before Email : " + email);
		email = email.replace("@", "_");
		System.out.println("After Email : " + email);
	}
}
