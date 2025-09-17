package api08.Stack;

import java.util.Stack;

/*
 * @날짜:2025. 9. 1.
 * @작성자:유승재
 * @설명:Stack
 */

public class Stack02 {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox=new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(5000));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin coin=coinBox.pop();
			System.out.println("꺼내온 동전:" + coin.getValue());
		}
	}

}
