package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner scanner = new Scanner(System.in);
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			//객체 생성시 서버 접속 시도
			socket = new Socket("127.0.0.1", 8282);
			System.out.println("Sever 접속 성공");
			
		//0.1	
		os = socket.getOutputStream();
		//char
		ow = new OutputStreamWriter(os);
		//Stream
		bw = new BufferedWriter(ow);
		
		String msg = "Hello";
		System.out.println("서버로 보낼 메세지 입력");
		msg = scanner.next();
		bw.write(msg+"\r\n");
		bw.flush();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	}
		}
	}

}