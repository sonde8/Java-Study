package ch04.function;

/*
 * @날짜:2025. 8. 22.
 * @작성자:유승재
 * @설명:함수 - call by value
 * 함수를 사용하는 이유 - 중복성을 없애고, 가독성이 좋아야됨.
 */

public class Exam50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sub(2, 5);
		System.out.println("Working..");
		System.out.println("");
		
		sub(3, 3);
		System.out.println("Working...");
		System.out.println("");
		
		sub(2, 10);
		System.out.println("End");
	}
	
	public static void sub(int x, int y) {
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
