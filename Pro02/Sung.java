package ch05.object;

public class Sung {
	public String name;
	public int kor;
	public int eng;
	public int mat;
	public int tot;
	public float avg;
	
	public void total() {
		tot=kor+eng+mat;
	}
	public void average() {
		avg=(float)tot/3;
	}
	public void disp() {
		System.out.println("이름:"+name);
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
	}
}

