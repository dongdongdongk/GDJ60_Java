package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain3 {

	public static void main(String[] args) {
		//Collection 은 Type에 안전하지 않다.
		//Generic : Type 의 안전성
		//E : 변수명
	
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(1);
		int num = ar.get(0);
		
		ArrayList<WeatherDTO> ar2 = new ArrayList<>();
		WeatherDTO weatherDTO = new WeatherDTO();
		weatherDTO.setCity("Seoul");
		ar2.add(weatherDTO);
		weatherDTO.setCity("Jeju");
		ar2.add(weatherDTO);
		
		weatherDTO = new WeatherDTO();
		weatherDTO.setCity("Jeju");
		
		ar.remove(weatherDTO);
		for(int i=0;i<ar2.size();i++) {
			System.out.println(ar2.get(i).getCity());
		}
	}
}
