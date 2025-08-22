package ch04.function;

/*
 * @날짜:2025. 8. 22.
 * @작성자:유승재
 * @설명:함수 - 배열 사용
 */

public class Exam55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[] {10, 20, 30, 40, 50};
		sub1(a);
		
		String[] b=new String[] {"Kim", "Ryu", "Park"};
		sub2(b);
		
		int[] c=sub3();
		for(int i=0;i<c.length;i++){
			System.out.print(c[i] + "\t");
		}
		System.out.println();

	}

	public static void sub1(int[] a) {
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
	
	public static void sub2(String[] b) {
		System.out.println(b[1]);
	}
	
	public static int[] sub3() {
		int[] c=new int[] {55, 66, 77};
		return c;
	}
}
