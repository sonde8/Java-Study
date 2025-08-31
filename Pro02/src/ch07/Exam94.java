package ch07.interfaceA;

/*
 * @날짜:2025. 8. 27.
 * @작성자:유승재
 * @설명:interface
 * 		- 내부적으로 public static final 상수, public abstract 함수로 구성
 */

interface XX{
	public int SU=20;		// 변수 static final
	
	public void disp();		// 함수 추상함수(abstract)
}

class YY implements XX{		// 클래스가 인터페이스를 상속 받으려면 implements

	@Override
	public void disp() {
		System.out.println("Working...");
	}
	
	public void output() {
		
	}
	
}

class ZZ extends YY{ }		// 클래스가 클래스를 상속 받으려면 extends

interface Test extends XX{}	// 인터페이스가 인터페이스를 상속 받으려면 extends

public class Exam94 {

	public static void main(String[] args) {
		
		// XX a=new XX();	인터페이스는 자기의 객체를 만들 수 없음
		
		YY y=new YY();
		y.disp();
		y.output();
		
		XX x=new YY();
		x.disp();
		// x.output();

	}

}
