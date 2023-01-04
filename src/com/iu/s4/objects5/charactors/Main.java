package com.iu.s4.objects5.charactors;

public class Main {

	public static void main(String[] args) {
		
		Archer archer = new Archer();
		
		Character character = null;
		
		character = archer;
		
		archer = (Archer)character;
		
		archer.attack();
		
		System.out.println("테스뚜");
		//
		
	}

}
