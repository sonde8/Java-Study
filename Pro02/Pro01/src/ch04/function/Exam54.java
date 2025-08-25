package ch04.function;

/*
 * @날짜:2025. 8. 22.
 * @작성자:유승재
 * @설명:함수 - call by value ~ return
 */

public class Exam54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=sub1();
		System.out.println(x);
		
		float y=sub2();
		System.out.println(y);
		
		String z=sub3();
		System.out.println(z);
		
		int sum=sub4(5, 6);
		System.out.println(sum);

	}
	
	public static int sub1() {
		int x=10;
		++x;
		return x;
	}
	
	public static float sub2() {
		return 24.4f;
	}
	
	public static String sub3() {
		return "apple";
	}

	public static int sub4(int a, int b) {
		return a+b;
	}
}
