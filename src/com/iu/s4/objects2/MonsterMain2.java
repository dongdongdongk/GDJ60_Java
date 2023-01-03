package com.iu.s4.objects2;

public class MonsterMain2 {
	public static void main(String[] args) {
		Monster mon1 = new Monster();
		mon1.power = 10;
		mon1.hp = 100;
		Monster mon2 = new Monster();
		mon2.power = 10;
		mon2.hp = 90;
		
		System.out.println(mon1 == mon2);
		
		boolean result = mon2.checkValue(mon1);
		System.out.println("Result : " + result);
	}
}
