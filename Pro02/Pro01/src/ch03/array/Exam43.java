package ch03.array;

/*
 * @날짜:2025. 8. 21.
 * @작성자:유승재
 * @설명:다차원 배열
 */

import java.util.Scanner;;

public class Exam43 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int[][] array=new int[2][3];
		
		// 배열 데이터 입력
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.println(i + "행" + j + "열" + "수를 입력:");
				array[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		
		// 출력 또는 연산
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				// if(array[i][j] > 0){....}
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
