package ch01.dataType;

/*
 * 7. 삼항 연산자 : 조건식 ? 참:거짓
 * 8. 대입 연산자 : =, *=, /=, %=, +=.=, -=, <<=, >>=, >>>=, &=, ^=, !=
 * 9. 후위형 증감 연산자
 * 10. 순차(컴마) 연산자
 */

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		System.out.println(a==10? "True":"False");
		
		int b=20;
		int c=30;
		int d=b!=c ? b:c;
		System.out.println(d);
		System.out.println();
		
		int i=100;
		System.out.println(i+=2);		// i=i+2
		System.out.println(i-=2);		// i=i-2
		System.out.println(i*=2);		// i=i*2
		System.out.println(i/=2);		// i=i/2
		System.out.println(i);
		System.out.println();
		
		int x=10, y=20, z=30;
		System.out.println(x + "\t" + y + "\t" + z);
		System.out.println("--------------------");
		
		
		int su=10;
		int value=20;
		System.out.println(su);
		System.out.println("su:" + su);
		System.out.println("su" + su + "\t value" + value);
		
		System.out.println(su + value);
		System.out.println(su + " " + value);
		System.out.println("결과:" + su + value);
		System.out.println("결과:" + (su + value));

	}

}
