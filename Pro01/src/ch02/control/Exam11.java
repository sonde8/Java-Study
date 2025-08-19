package ch02.control;

/*
 * 제어문 - 조건문 (if, switch ~ case)	/ 반복문 (for, while, do ~ while)
 * 	    
 * 		- 조건문(if)
 * 		- if(조건식){
 * 			 문장
 * 		   }
 */

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score=93;
		if(score >= 90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		int num=52;
		int value=24;
		if(num > value) {
			System.out.println("num가 value보다 크다");
		}
		
		if(num == value) {
			System.out.println("num와 value가 같다");
		}
		
		if(num < value) {
			System.out.println("num가 value보다 작다");
		}
		
		int su=20;
		if(su%2 == 0) {
			System.out.println("짝수입니다.");
		}
		
		if(su%2 != 0) {
			System.out.println("홀수입니다.");
		}

	}

}
