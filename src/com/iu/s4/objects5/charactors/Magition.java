package com.iu.s4.objects5.charactors;

public abstract  class Magition extends Character {

	
	private int mp;
	
	public Magition() {
	}
	public void attack() {
		System.out.println("마법 공격");
	}
	
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public abstract void spell();
	
}
