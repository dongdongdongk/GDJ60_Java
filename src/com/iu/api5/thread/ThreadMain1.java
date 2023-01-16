package com.iu.api5.thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1();
		ThreadTest2 tt2 = new ThreadTest2();
		
		tt1.start(); //OS에게 부탁
		tt2.start();
	}
}
