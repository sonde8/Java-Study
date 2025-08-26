package ch05.object;

/*
 * @날짜:2025. 8. 25.
 * @작성자:유승재
 * @설명:생성자
 */

class TestA{
	public TestA() {
		System.out.println("hi");
	}
}

class TestB{
	public TestB() {
		System.out.println("안녕하세요");
	}
}

class TestC{
	private int x;
	private int y;
	private int z;
	
	
	public void disp() {
		System.out.println(x+"\t"+y+"\t"+z);
	}
}

public class Exam70 {
	public static void main(String[] args) {
		TestA a=new TestA();
		
		TestB b=new TestB();
		
		// TestC c=new TestC(10, 20, 30);
	}

}


