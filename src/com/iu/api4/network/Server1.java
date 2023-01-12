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
import java.util.Scanner;

public class Server1 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sc = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);
		InputStream is = null;
		InputStreamReader ir = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		try {
			ss = new ServerSocket(8282);
			System.out.println("Client 접속을 기다리는 중");
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			is	= sc.getInputStream();
			String msg = br.readLine();
			System.out.println("client : "+ msg);
			System.out.println("Client 로 보낼 메세지 입력");
			msg = scanner.next();
			
			//0.1	
			os = sc.getOutputStream();
			//char
			ow = new OutputStreamWriter(os);
			//Stream
			bw = new BufferedWriter(ow);
			
			bw.write(msg+"\r\n");
			bw.flush();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
