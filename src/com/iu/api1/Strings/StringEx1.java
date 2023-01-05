package com.iu.api1.Strings;

public class StringEx1 {

	public static void main(String[] args) {
		
//		String phone = "010-1234-5678";
//		int temp=0;
//		int min;
//		for(int i=0;i<phone.length();i++) {
//			 min = phone.indexOf('-' , temp);
//			
//			
//			System.out.println(min);
//		}
		String phone = "010-1234-5678-545-54-3-62342123-4";
		boolean check = true;
		int idx = 0;
		while(check) {
			idx = phone.indexOf('-',idx);
			if(idx != -1) {
				System.out.println("IDX : " +idx);
				idx++;
			}else {
				check = false;
				break;
			}
		}
	}
}
