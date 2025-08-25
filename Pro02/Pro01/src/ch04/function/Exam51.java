package ch04.function;

/*
 * @날짜:2025. 8. 22.
 * @작성자:유승재
 * @설명:함수 - call by value
 */

import java.util.Scanner;

public class Exam51 {

	public static void main(String[] args) {	// 시작함수
		// TODO Auto-generated method stub
		
		input();
	}
	
	public static void input() {				// 데이터를 입력받는 함수
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름:");
		String name=sc.next();
		
		System.out.println("주민번호:");
		String idNumber=sc.next();
		
		System.out.println("주소:");
		String addr=sc.next();
		
		output(name, idNumber, addr);
		sc.close();
	}
	
	public static void output(String n, String j, String a) {	// 출력함수
		System.out.println("이름:" + n);
		System.out.println("주민번호:" + j);
		System.out.println("주소:" + a);
	}

}
