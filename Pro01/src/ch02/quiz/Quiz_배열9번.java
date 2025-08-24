package ch02.quiz;

import java.util.Scanner;

public class Quiz_배열9번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int array[]=new int[10];
		int sum=0;
		
		System.out.println("정수 10개 입력");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
			if(array[i]%3==0) {
				sum+=array[i];
			}
		}
		System.out.println("sum:" + sum);
		
		sc.close();
	}

}
