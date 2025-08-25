package ch02.quiz;

public class Quiz_반복문12번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum=0;
		for(double x=1;x<=100;x++) {
			sum+=(x*0.01);
		}
		System.out.println("sum:" + sum);
		
	}

}
