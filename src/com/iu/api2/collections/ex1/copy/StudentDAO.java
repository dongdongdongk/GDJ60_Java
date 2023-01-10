package com.iu.api2.collections.ex1.copy;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	
	private StringBuffer sb;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
		
		
		
	}
	
	public void init() {
		StudentData sd = new StudentData();
		ArrayList<String> arraylist = new ArrayList<String>();
		String sb2 = sb.toString();
		sb2 =sb2.replace(",", "");
		sb2 = sb2.replace(" ","-");
		StringTokenizer st = new StringTokenizer(sb2 ,"-");
		int idx = 0;
		while(st.hasMoreTokens()) {
			 sd.setName(st);
		
			
			System.out.println(st.nextToken());
		}
		
	}

}
