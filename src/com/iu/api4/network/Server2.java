package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class Server2 {

	public static void main(String[] args) {
		//Client 접속대기 
		//1번 받으면 점심메뉴중 랜덤하게 하나를 골라 전송
		//2. 저녁메뉴 중에 골라서 전송
		//3. 종료
		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		OutputStream os = null;
		InputStreamReader ir = null;
		OutputStreamWriter ow = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		try {
			ss = new ServerSocket(8282);
			System.out.println("클라이언트 접속 대기중");
			sc = ss.accept();
			
			System.out.println("Client 연결됨");
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			is = sc.getInputStream();
			
			while(true) {
				int num = br.read();
				int rd = random.nextInt(2);
				String js = null;
				if(num==3) {
					System.out.println("종료");
					break;
				}else if(num==1) {
					switch(rd) {
					case 0:
						js = "점심:밥";
					case 1:
						js = "점심:빵";
					case 2:
						js = "점심:떡";		
					}
				}else if(num==2) {
					switch(rd) {
					case 0:
						js = "저녁:밥";
					case 1:
						js = "저녁:빵";
					case 2:
						js = "저녁:떡";
					}
				}
				
			}
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
