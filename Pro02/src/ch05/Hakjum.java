package ch05.object;

import java.util.Scanner;

public class Hakjum {
	public String name;
	public int kor;
	public int eng;
	public int mat;
	public int tot;
	public float avg;
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름:");
		name=sc.next();
		
		System.out.println("국어:");
		kor=sc.nextInt();
		
		System.out.println("영어:");
		eng=sc.nextInt();
		
		System.out.println("수학:");
		mat=sc.nextInt();
	}
	
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

