package com.iu.api1.Strings.ex3;

import java.util.Scanner;

public class WeatherController {

	//start
	//1. 날씨정보초기화
	// 	 init 호출 초기화가 완료 되었습니다.
	//2. 전국날씨정보
	//   weatherDTo 정보 출력
	//3. 지역날씨검색
	//   도시정보가 없습니다 
	//4. 지역날씨추가
	//5. 지역날씨삭제 
	//6. 종료 
	public void start() {
		WeatherData weatherData = new WeatherData();
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		System.out.println("1.날씨정보 초기화\n2.전국날씨정보\n3.지역날씨검색\n4.지역날씨추가\n5.지역날씨삭제\n6.종료" );
		while(check) {
			int input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.println("날씨정보 초기화");
				weatherData.init();
				System.out.println("초기화가 완료 되었습니다.");
				break;
			
			case 2:	
				System.out.println("전국 날씨정보");
				
			}
			
		}
	}


}
