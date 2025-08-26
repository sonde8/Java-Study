package ch05.object;

/*
 * @날짜:2025. 8. 26.
 * @작성자:유승재
 * @설명:	배열
 */

class TestE{
	private int x;
	private int y;
	
	public TestE() {}
	
	public TestE(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y);
	}
}

public class Exam76 {

	public static void main(String[] args) {
		
		TestE[] array=new TestE[3];
		array[0]=new TestE(10,20);	// x, y, TestE(), disp()
		array[1]=new TestE(50,60);	// x, y, TestE(), disp()
		array[2]=new TestE(80,90);	// x, y, TestE(), disp()
		
		for(int i=0;i<array.length;i++) {
			array[i].disp();
		}
		
		TestE a=new TestE(1,2);
		TestE b=new TestE(3,4);
		TestE c=new TestE(5,6);
		TestE[] arr=new TestE[] {a, b, c};
		for(int i=0;i<arr.length;i++) {
			arr[i].disp();
		}

	}

}
