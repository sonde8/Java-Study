package ch05.object;

import java.util.Scanner;

public class Exam64 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Sung a=new Sung();
		
		System.out.print("이름:");
		a.name=sc.next();
		
		System.out.print("국어:");
		a.kor=sc.nextInt();
		
		System.out.print("영어:");
		a.eng=sc.nextInt();
		
		System.out.print("수학:");
		a.mat=sc.nextInt();
		
		a.total();
		a.average();
		a.disp();
		
		sc.close();
	}

}
