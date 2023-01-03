package com.iu.s4.objects1;

public class ObjectMain2 {

	public static void main(String[] args) {
		//객체생성
		Sword sw = new Sword();
		sw.at = 50;
		sw.du = 200;
		sw.ef = 3;
		sw.name = "집행검";
		sw.pr = 50000;
		
		Knight kt = new Knight();
		kt.dex = 100;
		kt.hp = 1;
		kt.ht = 1;
		kt.it = 1;
		kt.str = 1;
		kt.name = "물주먹";
		
		kt.sword = sw;
		System.out.println(kt.sword.name);
		
		//변수 선언 
		Sword s2 = null;
		System.out.println(s2.at);
	}
}
