package ch05.object;

/*
 * @날짜:2025. 8. 25.
 * @작성자:유승재
 * @설명: 클래스 변수 접근 방법 -> 데이터 전달
 * 		.(점) 연산자 obj.name="홍길동"
 * 		멤버 함수
 * 		생성자
 */

public class Exam67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pay a=new Pay();
		a.input("메시", 2000000);
		a.yonsan();
		a.output();

		Pay b=new Pay();
		b.input("호날두", 5000000);
		b.yonsan();
		b.output();
		
		Pay c=new Pay();
		c.input("음바페", 4000000);
		c.yonsan();
		c.output();
	}

}
