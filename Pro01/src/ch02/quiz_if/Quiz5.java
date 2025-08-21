package ch02.quiz_if;

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if((i+j)==6) {
					System.out.println(i + "+" + j);
				}
			}
		}
		
		int sum=0;
		for(int i=10;i<=20;i++) {
			sum+=i;
		}
		System.out.println(sum);

		int x=10;
		while(x<=20) {
			sum+=x;
			x++;
		}
		System.out.println(sum);
		
		int y=10;
		do {
			sum+=y;
			y++;
		}while(y<=20);
		
		System.out.println(sum);
		
	}

}
