package com.iu.s4.objects2;

public class Monster {
	
	
	//멤버변수, instance 변수
	String name;
	int hp;
	int power;
	
	//멤버메서드,instance method
	//공격
	public boolean checkValue(Monster monster) {
		//나의 power 와 같고, 나의 hp가 같다면 true 리턴, false 리턴
		if(this.power==monster.power&&this.hp==monster.hp) {
			return true;
		}else {
			return false;
		}
			
		 
	}
	//어슬렁
	public void info() {
		//참조변수 this :class 내에서만 사용가능,자기자신 생선된 객체주로를 담음
		System.out.println(this.name);
		//this는 생략 가능 
		System.out.println(this.hp);
		this.attack();
	}
	
	public void attack() {
		System.out.println("공격합니다");
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
}
