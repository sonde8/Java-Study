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

public class Exam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score=50;
		
		if(score>=50) {
			System.out.println("합격입니다. 점수는" + score + "입니다.");
		}else {
			System.out.println("불합격입니다. 점수는" + score + "입니다.");
		}

		String name="홍길동";
		int age=27;
		if(age>=20 && age<30) {
			System.out.println("저는" + name + "입니다" + age + "살 입니다.");
		}else {
			System.out.println("20대가 아닙니다.");
		}
	}

}
