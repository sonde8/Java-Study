package ch05.object;

/*
 * @날짜:2025. 8. 25.
 * @작성자:유승재
 * @설명:쿨래스 3대 특징
 * 		은닉화(캡슐화), 중복성, 상속성
 */

public class Exam69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Saram s=new Saram();
		
		// ., 함수접근
		s.name="유승재";
		s.address="서울시 마포구 성산동";
		s.phoneNumber="010-6311-5790";
		// s.juminBunho="12345-1234567";
		s.setJuminBunho("12345-1234567");
		s.age=28;

	}

}
