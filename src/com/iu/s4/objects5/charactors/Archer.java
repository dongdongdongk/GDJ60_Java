package com.iu.s4.objects5.charactors;

public class Archer extends Character {
	//field
	private int dex;
	
	//constructor
	public Archer() {
		
	}
	
	//method
	@Override
	public void attack() {
		System.out.println("활 공격");
	}
	
	public void move() {
		System.out.println("이동");
	}
	
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	
}
