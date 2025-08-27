package ch06.inheritance;

/*
 * @날짜:2025. 8. 26.
 * @작성자:유승재
 * @설명:생성자 상속
 */

class BParents{
	protected int x;
	protected int y;
	
	public BParents() {
		System.out.println("부모 기본 생성자");
	}
	
	public BParents(int x) {
		this.x=x;
		this.y=20;
	}

	public BParents(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class BSon extends BParents{
	private int z;
	
	public BSon() {
		super();	// 생략 가능
		System.out.println("자식 기본 생성자");
	}
	
	public BSon(int x) {	// x=10
		super(x);			// super(10)
		this.z=30;
	}
	
	public BSon(int x, int y, int z) {
		super(x, y);
		this.z=z;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y + "\t" + z);
	}
}

public class Exam85 {

	public static void main(String[] args) {
			
		BSon a=new BSon();		
		
		BSon b=new BSon(10);
		b.disp();
		
		BSon c=new BSon(100, 200, 300);
		c.disp();
		

	}

}
