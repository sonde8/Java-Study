package ch02.quiz_if;

import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 몇 번 입력받을지를 반복문으로?
		System.out.println("몇 개의 수를 입력받겠습니까?");
		int count=sc.nextInt();
		int sum=0;
		double avg=0;
		
		for(int i=0;i<count;i++) {
			System.out.println("수를 입력하세요:");
			int num=sc.nextInt();
			sum+=num;
			avg=(double)sum/count;
		}
		System.out.println("sum:" + sum);
		System.out.println("avg" + avg);
		
		
	}

}
