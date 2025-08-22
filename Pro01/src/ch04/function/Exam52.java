package ch04.function;

/*
 * @날짜:2025. 8. 22.
 * @작성자:유승재
 * @설명:함수 - call by value
 */

public class Exam52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		sub(a, b);		// sub로 넘어갈 때 a와b가 메모리에서 사라짐
		System.out.println("Working..");
	}
	
	public static void sub(int x, int y) {	// 다 끝나게 되면 x,y가 사라지고 다시 a,b에 값이 들어감ㅋ₩
		System.out.println(x);
		System.out.println(y);
	}

}
