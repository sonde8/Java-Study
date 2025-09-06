package ch08.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @날짜:2025. 9. 2.
 * @작성자:유승재
 * @설명:예외 처리 - 다중 catch
 */

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("x:");
			int x=sc.nextInt();
			
			System.out.println("y:");
			int y=sc.nextInt();
			
			int div=x/y;
			System.out.println("div:");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력 가능합니다.");
		}
		
		sc.close();
	}

}
