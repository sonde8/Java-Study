package ch01.dataType;

/*
 * 2. 단항연산자 : ! (일반부정, ~(이진 또는 비트 부정), +/-
 * 			 ++/-- (전위형 증감 연산자, 후위형 증감 연산자)
 * 			 (cast) 또는 (자료형)
 */

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a=10;
		short b=a;	// 동일 자료형 또는 큰 자료형
		System.out.println(a + "\t" + b);

		short c=20;
		byte d=(byte) c;
		System.out.println(c + "\t" + d);
		
		float i=11.1f;
		double j=12.2;
		
		// double k=i+j;
		float k=i+(float)j;
		System.out.println(k + "\n");
		
		int su=10;
		float value=33.3f;
		float result = su + value;
		System.out.println(result + "\n");
		
		int num=10;
		int imsi=3;
		float r = (float) num / imsi;	// 10.0f / 3
		// float r = num / (float) imsi;
		System.out.println("결과:" + r);
	}

}
