package com.iu.api3.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain1 {

	public static void main(String[] args) {
		
		//1.키보드 연결
		//표준입력기 : 키보드, 마우스, 스캐너
		//표준출력기 : 모니터
		Scanner sc = new Scanner(System.in);
		
		InputStream is = System.in;
		//char
		InputStreamReader ir = new InputStreamReader(is);
		//String 
		BufferedReader br = new BufferedReader(ir);
		
		try {
			String msg = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
