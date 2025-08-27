package ch06.inheritance;

/*
 * @날짜:2025. 8. 27.
 * @작성자:유승재
 * @설명:상속
 * 		- extends : 확장성, 중복 제거
 * 		- protected : 접근제한자 
 * 		- super, super() 
 * 		- 함수 재정의 : 상속 받아서 함수를 재정의 	 -> 자식입장
 * 					 자식 제어(컨트롤) 할 수 있음	 -> 부모입장
 */

class Shape{
	public void aa() {}
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void bb() {}
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void cc() {}
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void dd() {}
	public void draw() {
		System.out.println("Circle");
	}
}

public class Exam89 {

	public static void main(String[] args) {
		int a=10;
		long b=a;		 // 자동(묵시적) 형변환
		byte c=(byte) a; // 명시적 형변환
		
		Shape s=new Shape();	// aa(), draw()
		
		Line i=new Line();		// aa(), bb(), draw()

		Shape[] ss=new Shape[3];
		Line[] li=new Line[3];
		
		// Upcasting : 자식클래스가 부모클래스 타입으로 변환하는 것
		Shape shape=new Line();	// 자식
		shape.aa();
		// shape.bb();	ERROR
		shape.draw();
		
		Shape h=new Rect();
		h.aa();
		// h.cc();
		h.draw();
		
		Shape r=new Circle();
		r.aa();
		// r.dd();
		r.draw();
		
		System.out.println("--------------");
		
		Shape[] array=new Shape[3];
		array[0]=new Line();
		array[1]=new Rect();
		array[2]=new Circle();
		
		for(int j=0;j<array.length;j++) {
			array[j].aa();
			array[j].draw();
		}
	}

}
