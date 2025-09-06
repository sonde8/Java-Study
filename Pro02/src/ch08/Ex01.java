package ch08.Exception;

import java.util.Scanner;

/*
 * @날짜:2025. 9. 1.
 * @작성자:유승재
 * @설명:예외 처리 - ArithmeticException 수학적 오류
 */

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("x:");
		int x=sc.nextInt();

		System.out.println("y:");
		int y=sc.nextInt();
		
		try {
			int div=x/y;
			System.out.println("div" + div);
		} catch (ArithmeticException e) {	// 에러를 담음
			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
		sc.close();
	}

}
