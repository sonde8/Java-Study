package ch02.quiz;

public class Quiz_반복문13번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int y=1;y<=100;y++) {
			sum+=y;
			if(sum>500) {
				break;
			}
		}
		System.out.println("sum:" + sum);

	}

}
