package ch03.array;

import java.util.Scanner;

public class Exam38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 선언
		int[] array=new int[5];		// [0] ~ [4] 20byte
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		// 배열 입력
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			System.out.println("수를 입력하세요.");
			array[i]=sc.nextInt();
		}
		
		// 배열 출력
		for(int i=0;i<array.length;i++) {
			if(array[i]>0);
			System.out.println(array[i]);
		}
		
		sc.close();
	}

}
