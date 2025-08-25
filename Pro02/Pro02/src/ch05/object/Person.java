package ch05.object;

public class Person {		// 구현 클래스
	public String name;		// 멤버 변수
	public int age;
	public float height;	
	
	public void disp() {	// 멤버 함수
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println();
	}
}
