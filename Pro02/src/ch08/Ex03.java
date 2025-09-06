package ch08.Exception;

/*
 * @날짜:2025. 9. 2.
 * @작성자:유승재
 * @설명:예외 처리 - ArrayIndexOutOfBoundsException
 */

public class Ex03 {

	public static void main(String[] args) {
		
		try {
			String su=args[0];
			String value=args[1];
			
			System.out.println("su:" + su);
			System.out.println("value:" + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 수가 제대로 입력되지 않았습니다.");
		}
		
	
	}

}
