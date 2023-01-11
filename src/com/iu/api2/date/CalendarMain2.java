package com.iu.api2.date;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		Calendar sample = Calendar.getInstance();
		
		birth.set(1993, 8,2);
		
		sample.set(Calendar.MINUTE, sample.get(Calendar.MINUTE)+1);
		
		//현재시간을 밀리세컨즈로 변환 
		long n = now.getTimeInMillis();
		long s = sample.getTimeInMillis();
		long birth2 = birth.getTimeInMillis();
		
		
		
		n = n-birth2;
		n = n/(1000*60*60*24);
		n = n/365;
		System.out.println(s);
		System.out.println(n);
		System.out.println(now.getTime());
		System.out.println(birth.getTime());
		System.out.println();
	}
}
