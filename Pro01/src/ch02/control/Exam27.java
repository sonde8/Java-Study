package ch02.control;

/*
 * @날짜:2025. 8. 20.
 * @작성자:유승재
 * @설명:제어문 - 반복문 (while문)
 */

public class Exam27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 초기화, 조건값, 증감값
		
		int x=1;		// 초기값
		while(x<=10) {	// 조건값
			System.out.println(x);
			++x;		// 증감값
		}
		System.out.println();
		
		int sum=0;			//누적합 초기화
		int y=1;			// 초기화
		while(y<=100) {		// 조건값
			sum+=y;
			++y;
		}
		System.out.println(sum);
		
		// 다중 while		for (int i=1;i<=5;i++){for(int j=1;j<=3;j++){....}}
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=3) {
				System.out.println(i + "\t" + j + "\t");
				++j;
			}
			++i;
			System.out.println();
		}
		
		

	}

}
