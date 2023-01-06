package com.iu.api1.Strings.ex3_1;

import java.util.Scanner;

public class WeatherInput {
	
	//search
	//배열을 받고, 키보드로부터 검색할 도시명을 입력 받음
	//찾은 DTO를 리턴 -> Controller에 해당 지역 정보들 출력
	//없으면 null값 리턴
	public WeatherDTO search(WeatherDTO[] datas) {
		Scanner sc = new Scanner(System.in);
		System.out.println("지역을 입력하세요: ");
		String city = sc.next();
		WeatherDTO weatherDTO=null;
		for(int i=0;i<datas.length;i++) {
			if(datas[i].getCity().toUpperCase().equals(city.toUpperCase())) {
				weatherDTO = datas[i];
			}
		}
		return weatherDTO;
	}
	
	
	//add
	//배열을 받고, 키보드로부터 정보들을 입력 받음
	//배열에 추가하고 배열을 리턴
	public WeatherDTO[] add(WeatherDTO[] datas){
		WeatherDTO[] datas2 = new WeatherDTO[datas.length+1];
		for(int i=0;i<datas.length;i++) {
			datas2[i] = datas[i];
		}
		WeatherDTO weatherDTO = new WeatherDTO();
		Scanner sc = new Scanner(System.in);
		System.out.print("지역을 입력하세요: ");
		weatherDTO.setCity(sc.next());
		System.out.print("기온을 입력하세요: ");
		weatherDTO.setGion(sc.next());
		System.out.print("날씨를 입력하세요: ");
		weatherDTO.setStatus(sc.next());
		System.out.print("미세먼지를 입력하세요: ");
		weatherDTO.setMise(sc.next());
		datas2[datas.length] = weatherDTO;
		datas = datas2;
		return datas;
	}
	
	//remove
	//배열을 받고, 키보드로부터 삭제할 도시명을 입력 받음
	//배열에서 삭제하고 배열을 리턴
	public WeatherDTO[] remove(WeatherDTO[] datas){
		WeatherDTO[] datas2 = new WeatherDTO[datas.length-1];
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 지역을 입력하세요: ");
		String city = sc.next();
		int idx = 0;
		
		for(int i=0;i<datas.length;i++) {
			if(datas[i].getCity().toUpperCase().equals(city.toUpperCase())) {
				continue;
			}
			datas2[idx]=datas[i];
			idx++;
		}
		datas = datas2;
		return datas;	
	}

}
