package api08.Stack;

import java.util.Stack;

/*
 * @날짜:2025. 9. 1.
 * @작성자:유승재
 * @설명:LIFO(Last In Firtst Out) 구조로 동작하는 자료형
 * 		- 웹 브라우저 Stack 자료형으로 작성 -> 뒤로가기 버튼
 * 		- 엑셀, 워드 등등 -> 되돌리기 버
 */

public class Stack01 {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop() + "\t" + stack.size());
		}
	}

}
