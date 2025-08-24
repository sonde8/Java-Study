package ch02.quiz;

import java.util.Scanner;

public class Quiz_배열11번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("인원수를 입력하세요");
		
		int count=sc.nextInt();
		int[] total = new int[count];
        double[] avg = new double[count];
		
		String[] names=new String[count];
		int[][] scores=new int[count][3];
		
		for(int i=0;i<count;i++) {
			System.out.println("이름을 입력하세요:");
			names[i]=sc.next();
			
			System.out.println("국어");
			scores[i][0]=sc.nextInt();
			
			System.out.println("수학");
			scores[i][1]=sc.nextInt();
			
			System.out.println("영어");
			scores[i][2]=sc.nextInt();
			
			total[i] = scores[i][0] + scores[i][1] + scores[i][2];
            avg[i] = total[i] / 3.0;
		}
		
		System.out.println("\n이름\t국어\t수학\t영어\t총점\t평균");
		for(int i=0;i<count;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
                    names[i], scores[i][0], scores[i][1], scores[i][2],
                    total[i], avg[i]);
		}
		
		sc.close();
	}

}
