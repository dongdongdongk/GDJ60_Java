package com.iu.api1.Strings.ex3_1;

public class Ex3Main {

	public static void main(String[] args) {
		System.out.println("Start");

		
		WeatherController wc = new WeatherController(); //컨트롤러 객체생성
		wc.start(); //컨트롤러 start 메소드 호출
//		WeatherData weatherData =new WeatherData();
//		WeatherDTO[] datas = weatherData.init();
//		WeatherView weatherView = new WeatherView();
//		for(int i=0;i<datas.length;i++) {
//			System.out.println(datas[i].getCity());
//			System.out.println(datas[i].getStatus());
//		}
//		weatherView.view(datas);
		
		WeatherController wc = new WeatherController();
		wc.start();
		
		System.out.println("finish");
	}
	

}