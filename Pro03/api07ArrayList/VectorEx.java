package api07.ArrayList;

import java.util.Vector;

/*
 * @날짜:2025. 9. 1.
 * @작성자:유승재
 * @설명:List - Vector
 * 		ArrayList와 Vector 사용법이 거의 비슷
 * 		차이점 : ArrayList 속도가 더 빠름
 * 		스레드 동기화가 되어 있어 복수의 스레드가 동시에 Vector에 접근해서 객체
 */

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		
		System.out.println(vec.get(2));
		System.out.println();
		
		for(int i=0;i<vec.size();i++) {
			System.out.println(vec.get(i));
		}
		
		vec.add(65);		// 추가
		vec.add(2, 77);		// 해당번지 추가
		vec.set(1, 99);		// 교체
		vec.remove(2);		// 삭제
		
		System.out.println(vec);
		
		Vector<Data> d=new Vector<Data>();
		d.add(new Data(1, 2));
		
	}

}
