package ch02.control;

/*
 * @날짜:2025. 8. 21.
 * @작성자:유승재
 * @설명:반복을 활용한 표준 입출력
 */

import java.util.Scanner;

public class Exam35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	
		// 수치반복 : 초기값, 조건값, 증감값
		
		char ch1=0;		// int a=0;, double b=0.0;, char ch1=0;, String str=null or str="";
		
		do {	// key:y 반복처리 key:n 종료
			System.out.println("Hello java");
			
			System.out.println("반복할래(y/n)");
			String str=sc.next();	// 문자열로 입력 받음
			ch1=str.charAt(0);		// 문자 바꾸는 과정
			
			if(ch1=='n' || ch1=='N') {
				System.out.println("종료합니다.");
				break;
			}
			
		}while(ch1=='y' || ch1=='Y');
		
		System.out.println();
		
		char ch2=0;
		while(true) {	// while(1)
			for(int i=1;i<=5;i++) {
				System.out.println("오늘은 목요일입니다.");
			}
			
			System.out.println("반복할래(y/n)");
			String str=sc.next();
			ch2=str.charAt(0);
			
			if(ch2=='n' || ch2=='N') {
				System.out.println("종료합니다.");
				break;
			}
		}
		
		
		
		sc.close();

	}

}
