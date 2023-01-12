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

public class Server1_1 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sc = null;
		Scanner scanner = new Scanner(System.in);
	
		InputStream in = null;
		OutputStream out = null;
		
		InputStreamReader ir = null;
		OutputStreamWriter ow = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			ss = new ServerSocket(8282);
			System.out.println("Client 접속 대기중");
			sc = ss.accept();
			System.out.println("Client 연결됨");
			ir = new InputStreamReader(in);
			ow = new OutputStreamWriter(out);
			br = new BufferedReader(ir);
			bw = new BufferedWriter(ow);
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
