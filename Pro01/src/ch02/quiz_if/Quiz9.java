package ch02.quiz_if;

import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int pos=0;
		int neg=0;
		
		for(int i=0;i<10;i++) {
			System.out.println("수를 입력하세요");
			int num=sc.nextInt();
			if(num>0) {
				pos+=1;
			}else {
				neg+=1;
			}
		}
		System.out.println("양수의 개수:" + pos);
		System.out.println("음수의 개수:" + neg);
	}

}
