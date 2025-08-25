package ch05.object;

public class Pay {
	public String name;
	public int bonbong;
	public int tax;
	public int silsu;
	
	
	public void input(String name, int bonbong) {
		this.name=name;
		this.bonbong=bonbong;
		yonsan();
	}
	
	public void yonsan() {
		this.tax=(int)(this.bonbong * 0.045 + 0.5);
		this.silsu=this.bonbong - tax;
		output();
	}
	
	public void output() {
		System.out.println("name:"+this.name);
		System.out.println("bonbong:"+this.bonbong);
		System.out.println("tax:"+this.tax);
		System.out.println("silsu:"+this.silsu);
	}
}
