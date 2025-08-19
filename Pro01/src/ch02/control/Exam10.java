package ch02.control;

/*
 * 제어문 - 조건문 (if, switch ~ case)	/ 반복문 (for, while, do ~ while)
 * 	    
 * 		- 조건문(if)
 * 		- if(조건식){
 * 			 문장
 * 		   }
 */

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=20;
		if(x > 10) {		// 20 > 10 if(1)
			System.out.println("10보다 큰 수입니다.");
		}
		
		System.out.println("");
		
		int y=50;	// 110 일 때는 100보다 크기 때문에 if문 자체가 동작을 하지 않음
		if(y > 0 && y < 100) {	// 50 > 0 && 50 < 100 if(1)
			y+=200;
			System.out.println(y);
		}
		
	}

}
