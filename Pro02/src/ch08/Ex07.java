package ch08.Exception;

/*
 * @날짜:2025. 9. 2.
 * @작성자:유승재
 * @설명:예외 처리 - 다중 catch
 */

public class Ex07 {

	public static void main(String[] args) {

		try {
			int su=Integer.parseInt(args[0]);
			int value=Integer.parseInt(args[1]);
			
			int div=su/value;
			System.out.println(div);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 잘못 입력하셨습니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열수의 수를 잘못 입력하셨습니다.");
		} finally {
			System.out.println("모든 예외처리 끝.");
		}
		
		System.out.println("End...");
	}

}
