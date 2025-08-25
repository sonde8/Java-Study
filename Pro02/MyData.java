package ch05.object;

public class MyData {
	private int x;
	private int y;
	
	public void setData(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+"\t"+y);
		System.out.println(this.x+"\t"+this.y);
	}
	
	public void disp() {
		System.out.println(x+"\t"+y);
	}
	
	public void aa() {}
}
