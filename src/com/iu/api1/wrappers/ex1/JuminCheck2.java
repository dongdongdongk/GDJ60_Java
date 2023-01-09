package com.iu.api1.wrappers.ex1;

import java.util.Scanner;

public class JuminCheck2 {

	//check
	//주민번호를 받아서 
	//991224-1234567
	//주민번호 입력 받아서 이 주민번호가 제대로 만들어진거냐 가까냐 판별하는거 
	//맨끝자리는 체크용 번호로 뺌
	//9		8	0	7	2	4- 1	 2 	3	4	5	6
	//2 	3 	4 	5	6	7  8	 9	2	3	4	5	
	//18	24	0	35	12	28	8	 18	6	12	20	30 // 다 더하기 
	//합이 122, 합을 11로 나누어서 나머지를 구한다.
	//122/11 = 몫:11, 나머지는 1
	//나머지값을 11로 뺀 결과값하고 체크용 번호랑 같은지 확인
	// 11-1=10
	// 11로 뺀 결과값이 두자리면
	// 11로 뺀 결과값을 다시 10으로 나눈 나머지를 체크용 번호랑 같은지 확인
	// 10/10 몫 :1 . 나머지는 : 0 0==7?
	public void check(String jumin) {
		int num = 2;
		int sum = 0;
		for(int i=0;i<jumin.length()-1;i++) {
			if(i==6) {
				continue;
			}
			sum = sum + Integer.parseInt(jumin.charAt(i)+"")*num;
			num++;
			if(num==10) {
				num = 2;
			}
		}
 		
	}
	


}	//
