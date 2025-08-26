package ch05.object;

/*
 * @날짜:2025. 8. 26.
 * @작성자:유승재
 * @설명:static 변수, static 함수
 */

class TestG{	// TestG a=new TestG(...)
	private String name;
	private int don;
	private static float iyul;
	
	public static void setIyul(float iyul) {
		TestG.iyul=iyul;
		System.out.println(TestG.iyul);

		// static 함수는 static 변수와 함수만 가져다 쓰기 때문에 static이 아니라면 오류가 발생
		// System.out.println(name);
		// aa();
	}
	
	TestG() { }
	
	public TestG(String name, int don, float iyul) {
		this.name=name;
		this.don=don;
		TestG.iyul=iyul;
	}
	
	public void disp() {
		System.out.println(name);
		System.out.println(don);
		System.out.println(iyul);
		
		aa();
	}
	
	public void aa() {
		
	}
}

public class Exam78 {

	public static void main(String[] args) {
		
		// int x=10; // stack 영역	
		// stack a=new heap영역
		// TestG a=new TestG();
		
		TestG a=new TestG("kim", 10000, 0.07f);
		TestG.setIyul(0.07f);
		a.disp();
		
		double x=Math.PI;
		System.out.println(x);
		
		double y=Math.abs(-22.6);
		System.out.println(y);
		
		String str=new String("apple");
		byte[] b=str.getBytes();
	}

	
	
	
	

}
