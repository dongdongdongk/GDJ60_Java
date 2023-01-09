package com.iu.api1.Strings;

public class StringBuffer1 {

	public static void main(String[] args) {
		//StringBuffer 는  String 이 아님 
		StringBuffer sb = new StringBuffer("Hello"); //hello
		
		//hello + world 
		
		sb.append("world");
		System.out.println(sb);
		
		//참조변수를 출력하면 toString() 호출 : 클래스명@객체주소 리턴 
		
		//toString 를 오버라이딩 했다.
		
		String str = sb;
		
	}
}
