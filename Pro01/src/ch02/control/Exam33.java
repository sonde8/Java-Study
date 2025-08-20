package ch02.control;

/*
 * @날짜:2025. 8. 20.
 * @작성자:유승재
 * @설명:표준 입출력
 */

import java.util.Scanner;

public class Exam33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="apple";	// view
		int x=10;			// view
		
		Scanner sc=new Scanner(System.in);	// 키보드
		
		System.out.println("문자열 입력:");
		String b=sc.next();
		System.out.println(b);
		
		System.out.println("숫자 입력:");
		int c=sc.nextInt();		// 문자형을 정수형으로 변환
		System.out.println(++c);
		
		System.out.println("숫자(byte) 입력:");
		byte d=sc.nextByte();
		System.out.println(d);
		
		System.out.println("실수형(float) 입력:");
		float e=sc.nextFloat();
		System.out.println(e);
		
		System.out.println("문자입력:");
		String str=sc.next();		// 문자열
		char ch=str.charAt(0);		// 문자열 변수에서 index 0번
		System.out.println(ch);
				
		
		sc.close();
		

	}

}
