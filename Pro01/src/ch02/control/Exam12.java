package ch02.control;

/*
 * 제어문 - 조건문 (if, switch ~ case)	/ 반복문 (for, while, do ~ while)
 * 	    
 * 		- 조건문(if ~ else)
 * 		- if(조건식){
 * 			 참일 때 문장
 * 		   } else{
 * 		 	 거짓일 때 문장
 * 		   }
 */

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=-25;
		if(a > 0) {
			System.out.println("양수입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		
		if(a%2==0) {
			a+=100;
			System.out.println("짝수입니다.");
			System.out.println(a);
		}else {
			a*=200;
			System.out.println("홀수입니다.");
			System.out.println(a);
		}

	}

}
