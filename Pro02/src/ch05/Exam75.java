package ch05.object;

/*
 * @날짜:2025. 8. 25.
 * @작성자:유승재
 * @설명:
 */

class TestY{
	private int x, y, z;
	private int a;
	
	public TestY() {
		x=100;
		y=200;
		z=300;
		a=400;
	}
	
	public TestY(int x) {
//		this.x=x;
//		y=200;
//		z=300;
//		a=400;
		
		this();
		this.x=x;
	}
	
	public TestY(int x, int y) {
//		this.x=x;
//		this.y=y;
//		z=300;
//		a=400;

//		this();
//		this.x=x;
//		this.y=y;
		
		this(x);
		this.y=y;
	}
}

public class Exam75 {

	public static void main(String[] args) {
		

	}

}
