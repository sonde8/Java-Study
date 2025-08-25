package ch04.function;

/*
 * @날짜:2025. 8. 21.
 * @작성자:유승재
 * @설명:함수 - call by name
 */

public class Exam47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=5; i++) {
			sub();
		}
		
		System.out.println("end");
	}
	
	public static void sub() {
		System.out.println("I Want to go home");
	}

}
