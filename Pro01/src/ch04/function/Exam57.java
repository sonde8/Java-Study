package ch04.function;

/*
 * @날짜:2025. 8. 22.
 * @작성자:유승재
 * @설명:함수 - 배열
 */

import java.util.Scanner;

public class Exam57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=null;
//		
//		for(int i=0;i<args.length;i++) {
//			sc=new Scanner(args[i]);
//			int value=sc.nextInt();
//			System.out.println(++value);
//		}
//		
//		sc.close();
		
		int sum=0;
		for(int i=0;i<args.length;i++) {
			int x=Integer.parseInt(args[i]);
			sum+=x;
		}
		System.out.println(sum);
	}

}
