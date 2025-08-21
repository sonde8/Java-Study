package ch04.function;

/*
 * @날짜:2025. 8. 21.
 * @작성자:유승재
 * @설명:함수 - Call by Name
 * 
 * 		프로그램은 크게 두가지로 구설
 * 		데이터 : 자료형 활용해서 변수, 배열
 * 		데이터 처리(기능) : 함수
 * 
 * 		클래스 : 데이터 + 기능
 */

public class Exam46 {

	public static void main(String[] args) {	// 컴파일러가 호출해주는 함수
// 접근제한자 지정예약어 반환타입 함수명(매개변수목록)
		sub();
		System.out.println("Haha");
		sub();
		System.out.println("Huh");
		sub();
		System.out.println("End");
	

	}
	
	public static void sub() {
		System.out.println("Hi");
	}


}
