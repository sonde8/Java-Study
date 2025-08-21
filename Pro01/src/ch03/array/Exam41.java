package ch03.array;

/*
 * @날짜:2025. 8. 21.
 * @작성자:유승재
 * @설명:2차원 배열
 */

public class Exam41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array=new int[][] {{10, 20, 30}, {40, 50, 60}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("행의 수:" + array.length);
		System.out.println("0행의 열의 수:" + array[0].length);
		System.out.println("1행의 열의 수:" + array[1].length);
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
