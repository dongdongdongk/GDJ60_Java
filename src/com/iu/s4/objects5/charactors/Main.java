package com.iu.s4.objects5.charactors;

public class Main {

	public static void main(String[] args) {
		Magition magition = new Magition();
		magition.getMp();
		magition.setMp(0);
		magition.setName("");
		
		Archer archer = new Archer();
		archer.setName("");
		archer.setLevel(3);
		magition.attack();
		archer.attack();
	
		
		
	}

}
