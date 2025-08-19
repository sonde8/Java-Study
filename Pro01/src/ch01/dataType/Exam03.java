package ch01.dataType;

/*
 * 2. 단항연산자 : ! (일반부정, ~(이진 또는 비트 부정), +/-
 * 			 ++/-- (전위형 증감 연산자, 후위형 증감 연산자)
 */

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		x++;	// 후위형 증감 연산자 11
		++x;	// 전위형 증감 연산자 12
		System.out.println(x);

		--x;	// 전위형 증감 연산자 11
		x--; 	// 후위형 증감 연산자 10
		System.out.println(x);
		System.out.println();
		
		int y=10;
		int z=y++;
		System.out.println("y:" + y);
		System.out.println("z:" + z);
		System.out.println();
		
		int a=10;
		int b=20;
		int c=++a + ++b;
		System.out.println(c);
	}

}
