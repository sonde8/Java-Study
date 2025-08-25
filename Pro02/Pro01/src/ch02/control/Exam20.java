package ch02.control;

public class Exam20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="홍길동";
		String grade="BB";
		String memberLevel="";
		
		switch(grade) {
		case "AA": case "aa":		// if(grade=="AA" || grade=="aa"){...}
			memberLevel="정회원";
			break;
		case "BB": case "bb":
			memberLevel="준회원";
			break;
		case "CC": case "cc":
			memberLevel="손님";
			break;
		}
		
		System.out.println(name + "회원님은" + memberLevel + "입니다.");

	}

}
