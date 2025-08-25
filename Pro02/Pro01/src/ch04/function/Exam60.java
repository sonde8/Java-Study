package ch04.function;

/*
 * @날짜:2025. 8. 22.
 * @작성자:유승재
 * @설명:변수종류
 * 		- 지역변수 : 블럭 단위 변수 선언
 * 		- 매개변수 : 함수 통해 
 * 		- static 변수 : 프로그램 시작 ~~ 끝 종료
 * 		- final 상수 : 
 */

public class Exam60 {
	public static int su=50;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=20;		// 지역변수
		
		
		{
			int z=30;
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(su);
			
		}
		System.out.println(x);
		System.out.println(y);
		// System.out.println(z); Error 
		System.out.println(su);
		
		sub(x, y);
	}
	
	public static void sub(int x, int y) {		// 매개변수(지역변수 의미)
		System.out.println();
		System.out.println(x);
		System.out.println(y);
		System.out.println(su);
	}

}
