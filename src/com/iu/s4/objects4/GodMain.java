package com.iu.s4.objects4;

public class GodMain {

	public static void main(String[] args) {
		God god = God.getInstance();
		god.setName("유일신");
		
		System.out.println("God " +god);
		System.out.println("Name :" + god.getName());
		
		God god2 = God.getInstance();
		god.setName("Test");
		System.out.println("God" + god2);
		System.out.println("Name :" + god2.getName());
	}

}
