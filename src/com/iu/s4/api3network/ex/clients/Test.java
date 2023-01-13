package com.iu.s4.api3network.ex.clients;

import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		
		String data2 ="1-iu-34-45-65-34";
		data2 = data.substring(data.indexOf("-")+1);
		StringTokenizer st = new StringTokenizer(data2,"-");
		while(st.hasMoreTokens()) {
			ServerDTO serverDTO = new ServerDTO();
		
			String t1 = st.nextToken();
			serverDTO.setName(t1);
			String t2 = st.nextToken();
			serverDTO.setNum(Integer.parseInt(t2));
			String t3 = st.nextToken();
			serverDTO.setKor(Integer.parseInt(t3));
			String t4 = st.nextToken();
			serverDTO.setEng(Integer.parseInt(t4));
			String t5 = st.nextToken();
			serverDTO.setMath(Integer.parseInt(t5));
			ar.add(serverDTO);
	}
	
}
