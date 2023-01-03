package com.iu.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		//1.학생수 입력
		//2. 학생수 만큼 이름을 입력
		//3. 학생수 만큼 학생의 번호, 국어, 영어, 수학입력
		// a 학생의 번호 :
		// a 학생의 국어 :
		//        영어
		//        수학
		// 총점과 평균 출력
		// B 의    번호 
		// ... 출력
		// 이름 번호 국어 영어 수학  총점 평균 
		// iu  1   54  65  43
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수 입력");
		int stn = sc.nextInt();
		String []stdn = new String[stn]; //학생이름
		int []sn = new int [stn]; //학생번호
		int []sg= new int [stn]; //학생국어
		int []se = new int [stn]; //학생영어
		int []sm = new int [stn]; //학생수학
		int []stall = new int [stn];//학생 총점
		double []stalld = new double [stn];
		
		for(int i=0;i<stn;i++) { //이름입력
			System.out.println("학생 이름 입력");
			String stdn2 = sc.next();
			stdn [i] = stdn2;
		}
		for(int i=0;i<stn;i++) {
			System.out.println(stdn[i] + "학생 번호 입력");
			int sn1 = sc.nextInt();
			sn [i] = sn1;
		}
		for(int i=0;i<stn;i++) {
			System.out.println(stdn[i] +"학생 국어점수 입력");
			int sg1 = sc.nextInt();
			sg [i] = sg1;
		}
		int sgsum = 0;     //학생 국어 총점,평균 출력
		double sgdiv = 0;
		for(int i=0;i<stn;i++) {
			sgsum += sg[i];
		}
		sgdiv = sgsum/stn;
		System.out.println("국어 총점 " + sgsum);
		System.out.println("국어 평균 " + sgdiv);
		
		
		for(int i=0;i<stn;i++) {
			System.out.println(stdn[i] +"학생 영어점수 입력");
			int se1 = sc.nextInt();
			se [i] = se1;
		}
		int sesum = 0;     //학생 영어 총점,평균 출력
		double sediv = 0;
		for(int i=0;i<stn;i++) {
			sesum += se[i];
		}
		sediv = sesum/stn;
		System.out.println("영어 총점 " + sesum);
		System.out.println("영어 평균 " + sediv);
		
		
		for(int i=0;i<stn;i++) {
			System.out.println(stdn[i] +"학생 수학점수 입력");
			int sm1 = sc.nextInt();
			sm [i] = sm1;
		}
		int smsum = 0;     //학생 수학 총점,평균 출력
		double smdiv = 0;
		for(int i=0;i<stn;i++) {
			smsum += sm[i];
		}
		smdiv = smsum/stn;
		System.out.println("수학 총점 " + smsum);
		System.out.println("수학 평균 " + smdiv);
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		int allsum = 0;
		double alldiv = 0;
		for(int i=0;i<stn;i++) {
			allsum = sn[i] + sg[i] + se[i] + sm[i];
			stall[i] = allsum;
			stalld[i] = allsum/stn;
			System.out.println(stdn[i]+"\t"+sn[i]+"\t"+sg[i]+"\t"+se[i]+"\t"+sm[i]+"\t"+stall[i]
					+"\t"+stalld[i]);
		}
		
		
	}
}
