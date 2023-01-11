package com.iu.api2.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalengerMain1 {

	public static void main(String[] args) {
		//GregorianCalendar
		
		Calendar ca = new GregorianCalendar();
		//현재날짜와 시간으로 객체가 만들어짐
		ca = Calendar.getInstance();
		System.out.println(ca);
		ca.set(Calendar.YEAR, 2032);
		ca.set(Calendar.MONTH, 11);
		
		ca.set(0, 0);
		//year
		//월은 0부터시작
		//일
		int time1 = ca.get(Calendar.HOUR);
		int time2 = ca.get(Calendar.MINUTE);
		int time3 = ca.get(Calendar.SECOND);
		int day = ca.get(Calendar.DAY_OF_WEEK);
		int date = ca.get(Calendar.DATE);
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH)+1;
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		
		
	}
}
