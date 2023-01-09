package com.iu.api1.Strings.ex3_1;

import java.util.Scanner;

public class WeatherController {
	//start 
	//1.날씨정보초기화 ->init()
	//	초기화 완료 되었습니다.
	//2.전국날씨정보	-> view()
	//3.지역날씨검색 
	//	없으면 도시 정보가 없습니다. 출력
	//4.지역날씨추가
	//5.지역날씨삭제
	//6.종	 료
	public void start() {
<<<<<<< HEAD
		Scanner sc = new Scanner(System.in); //스캐너 생성
		WeatherData weatherData =new WeatherData(); // 날씨 데이터 클래스생성
		WeatherDTO[] datas = null; // 날씨 DTO 배열 객체 생성 (기본값 null)
		
		WeatherView weatherView = new WeatherView(); //날씨 뷰 객체 생성 
		WeatherInput weatherInput = new WeatherInput(); // 날씨 입력 객체생성 
=======
		Scanner sc = new Scanner(System.in);
		WeatherData weatherData =new WeatherData();
		WeatherDTO[] datas = null;
		
		WeatherView weatherView = new WeatherView();
		WeatherInput weatherInput = new WeatherInput();
>>>>>>> f9a6b90f00e1bae955005b6d7ca6db362504499d
		
		while(true) {
			System.out.println("1.날씨정보초기화");
			System.out.println("2.전국날씨정보");
			System.out.println("3.지역날씨검색");
			System.out.println("4.지역날씨추가");
			System.out.println("5.지역날씨삭제");
			System.out.println("6.종 료");
<<<<<<< HEAD
			int num = sc.nextInt(); // num 변수 입력 ( 메뉴선택) 
			
			if(num==1) {
				datas=weatherData.init(); //datas 변수에 날씨 데이터 init 메소드 호출 대입  
				System.out.println("초기화 완료되었습니다.");
			}else if(num==2) {
				weatherView.view(datas); // 날씨 뷰 객체에 뷰 메소드 호출 매개변수는 datas( 날씨 DTO 배열) 초기화 해야 배열에 값이 들어가 있음
			}else if(num==3) {
				WeatherDTO weatherDTO = weatherInput.search(datas); // 날씨 DTO 에 날씨 입력의 서치에 DTO 배열 매개변수 
=======
			int num = sc.nextInt();
			
			if(num==1) {
				datas=weatherData.init();
				System.out.println("초기화 완료되었습니다.");
			}else if(num==2) {
				weatherView.view(datas);
			}else if(num==3) {
				WeatherDTO weatherDTO = weatherInput.search(datas);
>>>>>>> f9a6b90f00e1bae955005b6d7ca6db362504499d
				if(weatherDTO != null) {
					weatherView.view(weatherDTO);
				}else {
					System.out.println("그런 지역은 없어요!");
				}
			}else if(num==4) {
				datas = weatherInput.add(datas);
			}else if(num==5) {
				datas = weatherInput.remove(datas);
			}else if(num==6) {
				break;
			}else {
				
			}
		}
	}
}
