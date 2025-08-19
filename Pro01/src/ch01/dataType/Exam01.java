package ch01.dataType;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Working...");
		System.out.print("Hi");
		System.out.println("Hello" + "\n");
		// println은 줄바꿈이 행해짐
		
		System.out.println("정수형(기본) 자료형");
		// byte(1byte, 8bit), short(2byte, 16bit), int(4byte, 32bit), long(8byte, 64bit)
		
		byte a=10;		// 1byte (-128 ~ 127)
		short b=128;	// 2byte (-32768 ~ 32767) 
		int c=1000;		// 4byte (-2147483648 ~ 2147483647)
		long d=6880L; 	// 8byte (-2^63 ~ 2^63-1)
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c + "\t" + "d:" + d + "\n");
		
		
		System.out.println("실수형 자료형");
		float e=45.4f;		// 4byte (1.4E-45~3.4082E38)
		double f=120.40;	// 8byte (4.92E-324~1.8E308)
		System.out.println("e:" + e + "\t" + "f:" + f + "\n");
		
		System.out.println("문자 자료형");
		char x='A';		// 2byte
		char y='김';
		System.out.println(x+ "\t" + y + "\n");
		
		System.out.println("문자열 자료형");
		String str1="Hello";
		String str2="Java";
		String str3="Hello Java";
		System.out.println(str1 + "+" + str2 + "=" + str3 + "\n");
		
		System.out.println("논리형 자료형");
		boolean b1=true;	// true(1), false(0)
		boolean b2=false;
		System.out.println(b1);
		System.out.println(b2 + "\n");

	}

}
