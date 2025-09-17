package api06.Date;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

/*
 * @날짜:2025. 8. 29.
 * @작성자:유승재
 * @설명:Calendar 클래스
 */

public class CalendarEx {

	public static void main(String[] args) {
		
		Calendar today=Calendar.getInstance();
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH);
		int day=today.get(Calendar.DAY_OF_MONTH);
		
		int hour=today.get(Calendar.HOUR);
		int minute=today.get(Calendar.MINUTE);
		int second=today.get(Calendar.SECOND);
		
		int amPm=today.get(Calendar.AM_PM);
		
		System.out.print(year + "년도");
		System.out.print(month + "월");
		System.out.print(day + "일\t");
		
		System.out.print(hour + "시");
		System.out.print(minute + "분");
		System.out.print(second + "초");
		
		System.out.print(amPm==0 ? "오전":"오후");
		System.out.println();
		
		// Calendar 현재 시스템 날짜를 가져와 원하는 포맷 출력 방식
		Date date=today.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(date));
		
		// Date 현재 시스템 날짜를 가져와 원하는 포맷 출력 방식
		Date d=new Date();
		sdf.format(d);
	}

}
