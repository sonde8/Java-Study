package ch05.object;

/*
 * @날짜:2025. 8. 25.
 * @작성자:유승재
 * @설명:클래스 성적표 구하기
 */

import java.util.Scanner;

public class Exam65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		// 객체 생성
		Sung a=new Sung();
		
		// 변수 - 데이터 전달
		System.out.println("이름:");
		a.name=sc.next();
		
		System.out.println("국어:");
		a.kor=sc.nextInt();
		
		System.out.println("영어:");
		a.eng=sc.nextInt();
		
		System.out.println("수학:");
		a.mat=sc.nextInt();
		
		// 함수 호출
		a.total();
		a.average();
		a.disp();
		
		sc.close();
	}

}
