package ch07.interfaceA;

import java.util.Scanner;

/*
 * @날짜:2025. 8. 27.
 * @작성자:유승재
 * @설명:멤버변수, 지역변수, 매개변수/리턴
 */

class AA{
	public int x;
	
	public void disp() {
		int y=20;
	}
	
	public void aa(int su) {}
	
	public int bb() {
		int value=20;
		
		return value;
	}
	
}

class BB{
	public AA a;	// 멤버 객체 x, disp(), aa(), bb()
	public String str;
	public Scanner sc;
	
	public void output() {
		a=new AA();
		a.disp();
		a.aa(10);
		a.bb();
	}
	
	public void apple() {
		// 지역 객체
		AA a=new AA();
		Scanner sc=new Scanner(System.in);
	}
	
	public void banana(AA a) { }
	
	public AA melon() {
		AA a=new AA();
		return a;
	}
}

public class Exam95 {

	public static void main(String[] args) {
		AA a=new AA();
		
		BB b=new BB();
		b.banana(a);
		
		AA aa=b.melon();

	}

}
