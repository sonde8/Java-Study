package ch03.array;

/*
 * @날짜:2025. 8. 21.
 * @작성자:유승재
 * @설명:2차원 배열
 */

public class Exam42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double score[][]=new double[][] {{3.3, 3.4}, {4.2, 3.6}, {4.5, 4.1}, {3.9, 4.0}};
		
		double sum=0.0;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				sum+=score[i][j];
			}
		}
		
		System.out.println("전체합:" + sum);
	}

}
