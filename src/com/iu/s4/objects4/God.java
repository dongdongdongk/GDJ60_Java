package com.iu.s4.objects4;

public class God {

	private String name;
	
	private static God god = new God();
	
	static God getInstance() {
		return god;
	}
	private God() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
