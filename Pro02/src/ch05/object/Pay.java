package ch05.object;

public class Pay {
	public String name;
	public int bonbong;
	public int tex;
	public int silsu;
	
	public void input(String name, int bonnong) {
		this.name=name;
		this.bonbong=bonbong;
	}

	public void yonsan() {
		this.tex=(int)(this.bonbong*0.045+0.5);
		this.silsu=this.bonbong-tex;
	}
	
	public void output() {
		System.out.println("name:" + this.name);
		System.out.println("bonbong:" + this.bonbong);
		System.out.println("tex:" + this.tex);
		System.out.println("silsu:" + this.silsu + "\n");
		
	}
}
