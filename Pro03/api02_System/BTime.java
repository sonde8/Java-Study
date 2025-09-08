package api02.System;

import java.util.Date;
import java.text.SimpleDateFormat;

/*
 * @날짜:2025. 8. 28.
 * @작성자:유승재
 * @설명:System 클래스 - currentTimeMillis() -> Date, SimpleDateFormat
 */

public class BTime {

	public static void main(String[] args) {
		long time=System.currentTimeMillis();
		System.out.println("현재 날짜를 초단위로:" + time);
		
		System.out.println("현재 날짜 시간을 나노초단위로:" + System.nanoTime());
		System.out.println();
		
		Date date=new Date(time);
		System.out.println(date);	// Thu Aug 28 12:27:05 KST 2025
									// 2025-08-28 12:27:05
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ds=sdf.format(date);
		System.out.println(ds);
	}

}
