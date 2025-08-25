package ch05.object;

public class MyData {	// this=myData	/ this=m
	private int x;		// this.x == myData.x	m.x
	private int y;		// this.y == myData.y	m.y

	// this.setData(int x, int y) == myData.setData()
	public void setData(int x, int y) {	// x=10, y=5
		this.x=x;
		this.y=y;
		System.out.println(this.x + "\t" + this.y);
	}
	
	// this.disp() == myData
	public void disp() {
		System.out.println(x + "\t" + y);	// 생략가능
	}
	
	public void aa() {}
	public void bb() {}
	public void cc() {}
}
