package ch02.control;

/*
 * @날짜:2025. 8. 20.
 * @작성자:유승재
 * @설명:제어문 - 다중 for (구구단 작성)
 */

public class Exam26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 열단위 출력
		for(int i=2;i<10;i++) {			// 1		2		3		9
			for(int j=1;j<10;j++) {		// 2~9		2~9		2~9		2~9
				System.out.print(i + "*" + j + "=" + (j*i));
			}
			System.out.println();
		}
		System.out.println();
		
		// 행단위 출력
		System.out.println("\t\t\t\t\t\t\t 구구단");
		for(int i=2;i<10;i++) {
			System.out.print(i + "단" + "\t\t");
		}
		System.out.println();
		
		for(int i=1;i<10;i++) {			// 1		2		3		9
			for(int j=2;j<10;j++) {		// 2~9		2~9		2~9		2~9
				System.out.print(j + "*" + i + "=" + (j*i)+"\t\t");
			}
			System.out.println();
		}

	}

}
