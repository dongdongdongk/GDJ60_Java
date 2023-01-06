package com.iu.api1.Strings.ex3;

public class WeatherData {

	//field
	private String data;
	private WeatherDTO[] datap;
	
	//Constructor
	public WeatherData() {
		this.data = "SEOUL,12,맑음,60,Daegu,68,비,10,"
				+ "jeju,-56,눈,12,junju,32,흐림,5";
	}
		
	
	//init method
	 
	public WeatherDTO[] init() {
		String [] datas = this.data.split(",");
		WeatherDTO [] wethers = new WeatherDTO[datas.length/4];
		int idx = 0;
		for(int i=0;i<datas.length;i=i+4) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(datas[i]);
			weatherDTO.setGion(datas[i+1]);
			weatherDTO.setStatus(datas[i+2]);
			weatherDTO.setMise(datas[i+3]);
			
			wethers[idx]=weatherDTO;
			idx++;
		}
		
		return wethers;
	 }
//	 public void initdiv() {
//		 for(int i=0;i<data.length();i++) {
//			 int p = 0;
//			 p++;
//		 }
//	 }
	//data 에 있는 데이터를 파싱해서 각 데이터를 dto의 멤버 변수에 대입하고 dto리턴	
}

