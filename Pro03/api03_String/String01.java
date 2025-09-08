	package api03.String;

/*
 * @날짜:2025. 8. 28.
 * @작성자:유승재
 * @설명:String 클레스 - charAt(), length(), indexOf()
 */

public class String01 {

	public static void main(String[] args) {
		
		String subject="자바프로그래밍";	// 내부적으로 char[] 이다.
		System.out.println("문자 추출:" + subject.charAt(0));
		System.out.println("문자열 길이:" + subject.length());
		System.out.println("문자열 위치:" + subject.indexOf("프로그래밍"));
		System.out.println();
		
		// 주민번호로 남자, 여자 분류
		String juminBunho="123456-1234567";
		
		if(juminBunho.length() == 14) {
			int location=juminBunho.indexOf('-');
			
			if(location != -1) {
				char gen=juminBunho.charAt(location+1);	// charAt(7)
				// System.out.println(gen);
				
				switch(gen) {
				case '1': case '3': case '5':
					System.out.println("남자");
					break;
					
				case '2': case '4': case '6':
					System.out.println("여자");
					break;
					
				default:
					System.out.println("성별 없음");
				}
			}
		}else {
			System.out.println("다시 입력하세요");
		}

	}

}
