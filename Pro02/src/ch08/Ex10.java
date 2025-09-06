package ch08.Exception;

/*
 * @날짜:2025. 9. 2.
 * @작성자:유승재
 * @설명:예외 처리 - try ~~ catch ~~ finally
 * 		예외 발생 - throw
 * 		예외 전가 - throws
 */

class AA{
	public void subA()throws Exception {
		System.out.println("subA Function");
		
		Exception ex=new Exception("이 함수에 예외를 발생");
		throw ex;
	}
	
	public void subB()throws Exception {
		System.out.println("subB Function");
		
		subA();
	}
}

public class Ex10 {

	public static void main(String[] args)throws Exception {
		
		AA a=new AA();
		a.subB();
		
	}

}
