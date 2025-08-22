package ch04.function;

/*
 * @날짜:2025. 8. 22.
 * @작성자:유승재
 * @설명:함수중복 - funtion Overload(Overloading)
 * 				함수 이름은 같지만, 매개변수 타입과 개수가 다름 
 */

public class Exam58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		disp("홍길동");
		disp(10);
		disp(24.5f);
		disp('A');
		disp(55, 77);
	}

	public static void disp(String name) {
		System.out.println(name);
	}
	
	public static void disp(int x) {
		System.out.println(x);
	}
	
	public static void disp(float y) {
		System.out.println(y);
	}
	
	public static void disp(char ch) {
		System.out.println(ch);
	}
	
	public static void disp(int x, int y) {
		System.out.print(x + "\t" + y);
	}
	
	
}
