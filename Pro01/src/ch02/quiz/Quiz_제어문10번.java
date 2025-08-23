package ch02.quiz;

import java.util.Scanner;


public class Quiz_제어문10번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

		System.out.println("년수를 입력하세요");
		int year=sc.nextInt();
		System.out.println("대출금을 입력하세요");
		int money=sc.nextInt();
		
		double rate = 0;

        if (year == 7) {
            rate = 0.0725;
        } else if (year == 15) {
            rate = 0.085;
        } else if (year == 30) {
            rate = 0.09;
        } else {
            System.out.println("지원하지 않는 기간입니다.");
            return;
        }
        sc.close();

        // 월 이자 계산
        double monthlyInterest = (money * rate) / 12;
        System.out.println("월이자:"+(int)monthlyInterest);

     
	}

}
