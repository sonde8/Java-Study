package ch02.control;

/*
 * @날짜:2025. 8. 20.
 * @작성자:유승재
 * @설명:제어문 - break, continue
 */

public class Exam31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(j==3) {
					break;
				}
				
				System.out.println(i + "\t" + j);
			}
			
			System.out.println();
		}
		
		System.out.println("\n");
		
		
		AA:for(int i=0;i<3;i++) {
				for(int j=0;j<5;j++) {
					if(j==3) {
						// break AA;
						continue AA;
					}
					
					System.out.println(i + "\t" + j);
				}
			
			System.out.println();
		}
	}

}
