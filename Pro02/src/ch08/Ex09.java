package ch08.Exception;

import java.util.Scanner;

/*
 * @날짜:2025. 9. 2.
 * @작성자:유승재
 * @설명:예외 처리 - try ~~ catch ~~ finally
 * 		예외 발생 - throw
 */

public class Ex09 {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("수:");
			int su=sc.nextInt();
			
			if(su==10) {
				NumberFormatException ex=new NumberFormatException("사용자가 10을 입력하여 오류 발생");
				throw ex;	// 예외를 만듦
			}
		} catch (Exception e) {
			System.out.println("10은 입력이 불가합니다.");	// 사용자
			System.out.println(e.getMessage());			// 개발자
			e.printStackTrace();						// 예외발생 코드를 추적한 내용을 모두 콘솔에 출력
		}
	}
}