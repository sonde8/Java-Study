package ch01.dataType;

/*
 * 2. 단항연산자 : ! (일반부정, ~(이진 또는 비트 부정), +/-
 */

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// !(일반부정)
		boolean a=false;
		boolean b=!a;
		System.out.println(a);
		System.out.println(b + "\n");
		
		// ~(이진 또는 비트 부정)
		int c=~10;
		// 0000 1010 : 10
		// 1111 0101 : -11 음수의 하나 큰 값
		System.out.println(c);
		
		int d=~-15;
		// 1111 0001 : -15
		// 0000 1000 : 14 양수의 하나 작은 값
		System.out.println(d + "\n");
		
		// +/-
		int x=100;
		int y=-200;
		System.out.println(x + "\t" + y);
		System.out.println(-x + "\t" + -y);
		
		
		
	}

}
