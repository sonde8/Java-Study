package ch06.inheritance;

/*
 * @날짜:2025. 8. 27.
 * @작성자:유승재
 * @설명:함수재정의 -> 추상클래스, 추상함수 -> interface
 */

abstract class IParents{	// 추상클래스는 추상함수를 하나라도 가지고 있으면 
	protected int x, y;
	
	public void msg() {
		System.out.println("Working");
	}
	
	public abstract void disp();	// 추상함수
}

class ISon extends IParents {	// x, y, msg(), disp()

	@Override
	public void disp() {
		System.out.println("Son disp");
		
	}
	
}

class IDaughter extends IParents{	// x, y, msg(), disp()

	@Override
	public void disp() {
		System.out.println("Daughter disp");
		
	}
	
}

public class Exam91 {

	public static void main(String[] args) {
		
		// 추상클래스는 자신의 객체를 만들 수 없음
		// IParents a=new IParents();	ERROR

		ISon s=new ISon();
		s.disp();
		
		IDaughter d=new IDaughter();
		d.disp();
		
		System.out.println();
		
		IParents x=new ISon();
		x.disp();
		
		IParents y=new IDaughter();
		y.disp();
	}

}
