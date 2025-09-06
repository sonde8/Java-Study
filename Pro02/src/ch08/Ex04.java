package ch08.Exception;

/*
 * @날짜:2025. 9. 2.
 * @작성자:유승재
 * @설명:예외 처리 - NullPointerException
 */

public class Ex04 {

	public static void main(String[] args) {
		
		try {
			String data=null;
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("데이터를 정확히 입력해주세요.");
		}
		
		

	}

}
