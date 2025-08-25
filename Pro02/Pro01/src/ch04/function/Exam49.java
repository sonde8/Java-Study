package ch04.function;

public class Exam49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sub(10);
		sub2(10, 20);
		System.out.println("good");
		sub2(5, 7);
		System.out.println("end");

	}

	public static void sub(int x) {
		System.out.println(x);
	}
	
	public static void sub2(int x, int y) {
		System.out.println("y:" + y);
		
		for(int i=0;i<x;i++) {
			System.out.println("Hello Java");
		}
	}
}
