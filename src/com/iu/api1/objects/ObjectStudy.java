package com.iu.api1.objects;

public class ObjectStudy {

	public static void main(String[] args) {
		Object object = new Object();
		int test = object.hashCode();
		System.out.println(test);
		
		String r = object.toString();
		System.out.println(r);
		System.out.println(object); //object.toString(); 참조변수를 출력하면 toString 하는것과 같다.
	
		Child child = new Child();
		Object obj = new Object();
		System.out.println(object == obj);
		boolean check = object.equals(obj);
		
		child.toString();
		System.out.println(child.toString());
		System.out.println(child);
		System.out.println(child.hashCode());
		
		Object o = child; //다형성
		
		
		
	}
}
