package ch08.Exception;

/*
 * @날짜:2025. 9. 1.
 * @작성자:유승재
 * @설명:예외 처리 - NumberFormatException
 */

public class Ex02 {

	public static void main(String[] args) {
		
		String su="a100";		// view text
		String value="200";		// view text
		
		try {
			int isu=Integer.parseInt(su);
			int ivalue=Integer.parseInt(value);
			
			int result=isu+ivalue;
			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("숫자로 변환할 수 없는 값이 입력됐습니다.");
		}
		
		
	}

}
