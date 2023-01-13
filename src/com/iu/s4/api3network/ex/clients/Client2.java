package com.iu.s4.api3network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		//1. 서버 접속 시도
		//2. 1.점심, 2.저녁 3.종료
		//3. 1,2,3 고르기
		// 1번 : 서버에서 점심메뉴중 하나를 보내줌, 출력
		// 2번 : 서버에서 저녁메뉴중 하나를 보내줌, 출력
		// 3번 : 종료
		Scanner sc = new Scanner(System.in);
		Socket socket= null;
		InputStream is = null;
		InputStreamReader ir= null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		boolean check = true;
		StudentDAO studentDAO = new StudentDAO();
		StudentView studentView = new StudentView();
		StudentDTO studentDTO = new StudentDTO();
		String data = null;
		String name = null;
		
		
		try {
			socket = new Socket("192.168.1.120", 8282);
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			
			while(check) {
				System.out.println("1.전체학생정보출력");
				System.out.println("2.학생정보검색출력");
				System.out.println("3.학생정보추가");
				System.out.println("4.학생정보삭제");
				System.out.println("5.종료");
				int select = sc.nextInt();
				if(select==1) {
					bw.write(select+"\r\n");
					bw.flush();
					System.out.println("학생정보출력");
					 data = br.readLine();
					//studentDAO.init(data);
					studentView.view(studentDAO.init(data));
					
				
				}else if(select==2) {
					System.out.println("학생이름입력");
					name =sc.next();
					String fo = select + "-" + name;
					bw.write(fo +"\r\n");
					bw.flush();	
					data = br.readLine();
					if(data!=null) {
						studentView.view(studentDAO.init(data));	
					}else {
						System.out.println(data);
					}
					
				}else if(select==3) {
					System.out.println("학생정보추가");
					data = studentDAO.addStudent2();
					bw.write(select + "-" + data + "\r\n");
					bw.flush();
					System.out.println(br.readLine());
					
				}else if(select==4) {
					System.out.println();
				}
				
			}		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
