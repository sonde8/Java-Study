package ch02.quiz;

import java.util.Scanner;

public class Quiz_배열10번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		char[] day=new char[] {'일', '월', '화', '수', '목', '금', '토'};
		
	
		System.out.println("정수를 입력하세요");
		int num=sc.nextInt();
		
		int i=num%day.length;
		
		System.out.println(day[i]);

		sc.close();
	}

}
