package ch02.control;

/*
 * @날짜:2025. 8. 20.
 * @작성자:유승재
 * @설명:제어문 - break, continue
 */

public class Exam32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0;		// 초기값
		while(x<10) {	// 조건값	5<=10
			++x;			// 증감값
			
			if(x==5) {	// 5 == 5
				// break;
				continue;
			}
			
			System.out.println(x);		// 1 2 3 4
		}
		System.out.println();
		
		int y=0;		// 초기값
		
		do {
			
			++y;		// 증감값
			
			if(y==5) {
				break;
			}
			
			System.out.print(y);
			
		}while(y<=10);	// 조건값
		
		System.out.println();

	}

}
