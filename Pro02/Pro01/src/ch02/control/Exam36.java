package ch02.control;

/*
 * @날짜:2025. 8. 21.
 * @작성자:유승재
 * @설명:반복을 활용한 표준 입출력
 * 		자바 기본 입출력 : 키보드, 모니터(화면)
 * 			파일 입출력 : 다운로드, 업로드
 * 		 네트워크 입출력 : 소켓 입력, 소켓 출력 -> 채팅 프로그램
 */

import java.util.Scanner;

public class Exam36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		char loop=0;
		
		do {
			System.out.println("단을 입력하세요");
			int dan=sc.nextInt();
			
			for(int i=1;i<=9;i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
			System.out.println();
			
			System.out.println("계속 하시겠습니까?(y/n)");
			String str=sc.next();
			loop=str.charAt(0);
			
			if(loop=='n' || loop=='N') {
				System.out.println("종료합니다.");
				break;
			}
			
			
			
		}while(loop=='y' || loop=='Y');
		
		sc.close();

	}

}
