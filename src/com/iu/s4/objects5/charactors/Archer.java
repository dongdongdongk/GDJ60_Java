package com.iu.s4.objects5.charactors;

public class Archer extends Character implements AttackAble {
	//field
	private int dex;
	
	//constructor
	public Archer() {
		
	}
	
	//method
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
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

	@Override
	public void attack1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack3() {
		// TODO Auto-generated method stub
		
	}
	
}
