package ch02.quiz_if;

import java.util.Scanner;

public class Quiz_제어문13번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 연도 입력 받기
		// 윤년은 일반적으로 4년마다 돌아오지만 100으로 나눠떨어지면 윤년이 아님
		// 100으로 나눠 떨어져도 400으로 나눠지면 윤년이 맞음
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요");
		int year=sc.nextInt();
		
		 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println("윤년입니다.");
	        } else {
	            System.out.println("평년입니다.");
	        }
		
		 sc.close();
	}

}
