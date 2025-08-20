package ch02.quiz_if;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~20까지의 정수 중에 2의 배수 또는 3의 배수가 아닌 수의 총합을 구하기
		
		int sum=0;
		for(int i=1;i<=20;i++) {
			if(i%2!=0||i%3!=0) {
				sum+=i;
			}
		}
		System.out.println("sum:" + sum);
		
		double sum2=0;
		for(double x=1;x<=100;x++) {
			sum2+=(x*0.01);
		}
		System.out.println("sum2:" + sum2);
		
		int sum3=0;
		for(int y=1;y<=100;y++) {
			sum3+=y;
			if(sum3>500) {
				break;
			}
		}
		System.out.println("sum3:" + sum3);
	}
}
