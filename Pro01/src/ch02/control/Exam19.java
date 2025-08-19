package ch02.control;

/*
 * 	제어문 - 조건문 (if, if ~ else, if ~ else if / 중첩 if문)
 * 		 - 조건문 Switch ~ case 
 */		 

public class Exam19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int su=4;
		
		switch(su) {	// 실수형, 관계, 논리 연산자 사용 안 됨
		case 1:			// if(su==1){...}
			System.out.println("1번");
			break;		// 가장 가까운 블럭 밖으로 빠져나감
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("1~5까지만 가능합니다.");
			break;
		}
		
		System.out.println();
		
		int value=9;		// if(value >=1 && value <=3){...}
		switch(value) {		// if(value==1 || value==2 || value==3){...}
		case 1: case 2: case 3:
			System.out.println("Hi");
		break;
		case 4: case 5: case 6:
			System.out.println("Hello");
		break;
		case 7: case 8: case 9:
			System.out.println("Bye");
		break;
		
		}
	}

}
