package com.iu.s4.objects4;

public class CardMain {

	public static void main(String[] args) {
		//클레스명.변수명
		System.out.println(Card.size);
		Card.staticMethod();
		
		Card card = new Card();
		card.setShape("Heart");
		card.setColor("Red");
		card.setNumber(1);
	}

}
