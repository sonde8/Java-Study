package api05.Math;

/*
 * @날짜:2025. 8. 29.
 * @작성자:유승재
 * @설명:Math - 반올림, 올림, 내림
 */

public class ARoundEx {

	public static void main(String[] args) {
		
		double x=123.4567;
		double y=456.6789;
		
		long a=Math.round(x);
		System.out.println("반올림:" + a);

		int b=(int) Math.ceil(y);
		System.out.println("무조건 올림:" + b);
		
		int c=(int) Math.floor(x);
		System.out.println("무조건 내림:" + c);
		
		
		// 소수 둘째 자리에서 반올림해 첫째 출력
		double o=Math.round(x*10)/10.0;
		System.out.println("둘째자리 반올림, 첫째자리 출력:" + o);
		
		double i=Math.round(x*100)/100.0;
		System.out.println("셋째자리 반올림, 둘째자리 출력:" + i);
		
		double j=Math.ceil(x*1000)/1000.0;
		System.out.println("넷째자리 반올림, 셋째자리 출력:" + j);
	}

}
