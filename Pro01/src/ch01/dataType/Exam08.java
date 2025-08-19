package ch01.dataType;

/*
 * 6. 논리 연산자 : &, |, ^ (이진 논리 연산자)
 * 				 &&, || (일반 논리 연산자)
 */

public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a=10;
		byte b=2;
		// 10 : 0000 1010
		// 2  : 0000 0010
		
		// &  : 0000 0010 -> 2
		// |  : 0000 1010 -> 10
		// ^  : 0000 1000 -> 8
		System.out.println("a & b" + (a & b));	// &  : 0000 0010 -> 2
		System.out.println("a | b" + (a | b));	// |  : 0000 1010 -> 10
		System.out.println("a ^ b" + (a ^ b));	// ^  : 0000 1000 -> 8
		System.out.println();
		
		int x=15;
		boolean y=x>10 && x<20;		// 15>10 (1) && 15<20 (1)
		boolean z=x==10 || x==15;	// 15==10 (0) || 15==15 (1)
		System.out.println("x && x" + y);
		System.out.println("x || x" + z);
	}

}
