package api07.ArrayList;

import java.util.ArrayList;

/*
 * @날짜:2025. 8. 29.
 * @작성자:유승재
 * @설명:ArrayList <Data>
 */

public class ArrayList03 {

	public static void main(String[] args) {
		
		Data a=new Data(10, 20);
		Data b=new Data(30, 40);
		Data c=new Data(50, 60);
		
		ArrayList<Data> list=new ArrayList<Data>();	// Data 대신 Object도 가능
		list.add(a);
		list.add(b);
		list.add(c);
		
		for(int i=0;i<list.size();i++) {
			Data ab=list.get(i);	// Object로 받을 시 (Data) 다운캐스팅 필요
			ab.yonsan();
			System.out.println(ab.toString());
		}
		System.out.println();
		
		// 추가
		list.add(new Data(1, 2));
		list.add(2, new Data(3, 4));
		
		// 수정
		list.set(0, new Data(5, 6));
		for(int i=0;i<list.size();i++) {
			Data ab=list.get(i);	
			ab.yonsan();
			System.out.println(ab.toString());
		}
		
		// 삭제
		list.remove(0);
	}

}
