package ch02.quiz_if;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("어른의 수를 입력하세요.");
        int adult = sc.nextInt();
        System.out.println("청소년의 수를 입력하세요.");
        int youth = sc.nextInt();
        System.out.println("아이의 수를 입력하세요.");
        int child = sc.nextInt();

        int adultFee = 300;
        int youthFee = 200;
        int childFee = 100;

        if (adult >= 5) {
            childFee = 50; // 할인 적용
        }

        int sum = (adultFee * adult) + (youthFee * youth) + (childFee * child);

        System.out.println(sum);

        sc.close();

	}

}
