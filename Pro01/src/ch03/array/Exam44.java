package ch03.array;

/*
 * @날짜:2025. 8. 21.
 * @작성자:유승재
 * @설명:다차원 배열
 */

import java.util.Scanner;;

public class Exam44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int[][] array=new int[3][];
		array[0]=new int[3];
		array[1]=new int[2];
		array[2]=new int[4];
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.println("수 입력");
				array[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
