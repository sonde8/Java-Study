package ch06.inheritance;

/*
 * @날짜:2025. 8. 26.
 * @작성자:유승재
 * @설명:상속
 */

class AParents{
	protected int x, y;
}

class ASon extends AParents{	// x, y, a, b, disp()
	private int a, b;
	
	public void input(int x, int y, int a, int b) {
		this.x=x;
		this.y=y;
		this.a=a;
		this.b=b;
	}
	
	public void disp() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);	// 부모의 변수는 super로 구분
		System.out.println();
		
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
		System.out.println();
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println();
		
		System.out.println(b);
		System.out.println(this.b);
	}
	
	
}

public class EXam82 {

	public static void main(String[] args) {
		// AParents a=new AParents();	// x, y
		ASon b=new ASon();	
		b.input(10, 20, 30, 40);
		b.disp();

	}

}
