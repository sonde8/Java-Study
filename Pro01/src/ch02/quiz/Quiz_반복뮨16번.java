package ch02.quiz;

public class Quiz_반복뮨16번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int sum2=0;
		int sum3=0;
		for(int i=10;i<=20;i++) {
			sum+=i;
		}
		System.out.println(sum);

		int x=10;
		while(x<=20) {
			sum2+=x;
			x++;
		}
		System.out.println(sum2);
		
		int y=10;
		do {
			sum3+=y;
			y++;
		}while(y<=20);
		
		System.out.println(sum3);

	}

}
