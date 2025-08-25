package ch04.function;

/*
 * @날짜:2025. 8. 22.
 * @작성자:유승재
 * @설명:final 상수 / 지역, static
 */

public class Exam62 {
	public static final int VALUE=99;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		final int SU=77;
		// SU=88; Error
		
		System.out.println(SU);
		System.out.println(VALUE);
	}
	
	public final void aa() {}
	public static final void bb() {}
	public void cc() {}

}
