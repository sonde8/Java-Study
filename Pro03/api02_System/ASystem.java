package api02.System;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * @날짜:2025. 8. 28.
 * @작성자:유승재
 * @설명:System 클래스 - in, out
 */

public class ASystem {

	public static void main(String[] args) throws IOException{
		
		System.out.println("Working..");
		
		PrintStream ps=System.out;

		ps.println("API 시작");
		ps.println(10);
		ps.println(24.5f);
		System.out.println();
		
		
		InputStream is=System.in;
		
		// 바이트 방식, 문자 방식
		System.out.println("문자 입력1:");		// A
		char value=(char) is.read();
		is.read();	// \r
		is.read();	// \n
		
		System.out.println("문자 입력2:");
		char imsi=(char) is.read();
		is.read();	// \r
		is.read();	// \n
		
		System.out.println("문자 입력3:");
		char temp=(char) is.read();
				
		System.out.println(value);
		System.out.println(imsi);
		System.out.println(temp);
		
		System.out.println();
		
		Scanner sc=new Scanner(is);	// (InputStream is)
		
		System.out.println("문자열 입력:");
		String str=sc.next();
		System.out.println(str);
		
		System.out.println("문자 입력");
		String strCh=sc.next();
		char ch=strCh.charAt(0);	// 바이트방식처럼 활용 -> 문자열로 읽어옴 
		System.out.println(ch);
		
		sc.close();
	}

}
