package ch02.quiz;

import java.util.Scanner;

public class Quiz_제어문15번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num1=sc.nextInt();
		
		char sign;
        while (true) {
            System.out.println("부호를 입력하세요(+, -, *, /):");
            sign = sc.next().charAt(0);

            // 올바른 연산자면 반복문 탈출
            if (sign == '+' || sign == '-' || sign == '*' || sign == '/') {
                break;
            } else {
                System.out.println("잘못된 연산자입니다. 다시 입력하세요.");
            }
        }
		
		System.out.println("숫자를 입력하세요");
		int num2=sc.nextInt();
		
		int result=0;
		
		if(sign=='+') {
			result=num1+num2;
			System.out.println(result);
		}else if(sign=='-') {
			result=num1-num2;
			System.out.println(result);
		}else if(sign=='/') {
			result=num1/num2;
			System.out.println(result);
		}else if(sign=='*') {
			result=num1*num2;
			System.out.println(result);
		}
		
		
		sc.close();
	}

}
