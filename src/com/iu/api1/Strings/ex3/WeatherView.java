package com.iu.api1.Strings.ex3;

public class WeatherView {

	//2개의 메서드 생성
	
	//1.모든 날씨 정보를 출력 
	
	//2.DTO 하나의 정보를 출력
	WeatherData wetherData = new WeatherData();

	public void view(WeatherDTO [] datas) {
		for(int i=0;i<datas.length;i++) {
			this.view(datas[i]);
		}
	}
	
	public void view(WeatherDTO weatherDTO) {
		System.out.println("---------------");
		System.out.println("City : " + weatherDTO.getCity());
		System.out.println("Gion : " + weatherDTO.getGion());
		System.out.println("Status : " + weatherDTO.getStatus());
		System.out.println("Mise : " + weatherDTO.getMise());
		
	}
	public void weatherView() {
		for(int i=0;i<wetherDTO.length;i=i+4) {
			System.out.println(wetherDTO[i].getCity());
			System.out.println(wetherDTO[i].getStatus());
		}
	}
	
	
	
}
