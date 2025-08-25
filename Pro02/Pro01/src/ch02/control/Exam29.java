package ch02.control;

/*
 * @날짜:2025. 8. 20.
 * @작성자:유승재
 * @설명:제어문 - 반복문 (while, do~while 차이점)
 */

public class Exam29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		
		while(x>50) {	// 조건이 맞지 않아 실행이 안됨
			System.out.println("while x" + x);
		}
		
		do {	// 조건이 맞지 않아도 한 번은 실행이 됨
			System.out.println("do x:" + x);
		}while(x>50);

	}

}
