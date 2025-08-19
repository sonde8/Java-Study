package ch02.control;

/*
 * 제어문	- 반복문 (for, 다중 for)
 */

public class Exam22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=10;i++) {	// 반복
			System.out.println("How a u");	// 내용
		}
		System.out.println();
		
		for(int j=10;j>=1;j--) {			// 반복
			System.out.println("java");		// 내용
		}
		System.out.println();
		
		for(int k=1;k<=10;k++) {			// 반복
			System.out.println(k);			// 내용
		}
		System.out.println();
		
		for(int i=1;i<=100;i++) {			// 반복
			if(i%10 == 0) {
				System.out.println(i);		// 내용
			}
		}
	}

}
