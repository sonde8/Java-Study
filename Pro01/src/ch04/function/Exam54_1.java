package ch04.function;

/*
 * @날짜:2025. 8. 22.
 * @작성자:유승재
 * @설명:함수 - call by value ~ return
 */

import java.util.Scanner;

public class Exam54_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("name:");
		String name=sc.next();
		
		System.out.println("kor:");
		int kor=sc.nextInt();
		
		System.out.println("eng:");
		int eng=sc.nextInt();
		
		System.out.println("mat:");
		int mat=sc.nextInt();
		
		System.out.println("이름:" + name);
		
		int tot=total(kor, eng, mat);
		float avg=average(tot);
		
		System.out.println("총점:" + tot);
		System.out.println("총점:" + avg);
		
		sc.close();
	}
	
	// 총점 함수
	public static int total(int kor, int eng, int mat) {
		int tot=kor+eng+mat;
		return tot;
	}
	
	// 평균 함수
	public static float average(int tot) {
		float avg=(float)tot/3;
		return avg;
		
	}

}
