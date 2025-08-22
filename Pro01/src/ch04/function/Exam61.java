package ch04.function;

/*
 * @날짜:2025. 8. 22.
 * @작성자:유승재
 * @설명:static 변수
 */

public class Exam61 {
	public static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sub(10);
		sub(20);
		sub(30);
	}
	
	public static void sub(int x) {
		System.out.println(++count);
		System.out.println(x);
		System.out.println();
	}

}
