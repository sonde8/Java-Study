package ch08.Exception;

import java.util.Scanner;

/*
 * @날짜:2025. 9. 2.
 * @작성자:유승재
 * @설명:모든 예외 클래스는 Throwable -> Exception을 상속 받고 시작함
 */

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc=null;
		
		try {
			sc=new Scanner(System.in);
				
			System.out.println("x:");
			int x=sc.nextInt();
			
			System.out.println("y:");
			int y=sc.nextInt();
			
			int div=x/y;
			System.out.println("div:");
		} catch (Throwable e) {		// ArithmeticException, InputMismatchException
			System.out.println("숫자와 문자를 정확히 입력해주세요.");
		} finally {
			if(sc !=null) sc.close();
		}
		
		
		
	}

}
