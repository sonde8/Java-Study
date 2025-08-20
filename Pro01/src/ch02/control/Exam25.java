package ch02.control;

/*
 * @날짜:2025. 8. 20.
 * @작성자:유승재
 * @설명:	제어문 - 반목문 (다중 for)
 */

public class Exam25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				System.out.println(i + "\t" + j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(char i='A';i<='Z';i++) {	// A	B	 C
			for(char j=i;j<='Z';j++) {	// A~Z	B~Z	 C~Z
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		char ch='A';
		System.out.println();
		
		for(char i='A';i<='z';i++) {
			System.out.print(i);
			
			if(i=='Z') {
				System.out.println();
			}
		}

	}

}
