package ch02.control;

/*
 * 제어문 - 조건문 (if, switch ~ case)	/ 반복문 (for, while, do ~ while)
 * 	    
 * 		- 조건문(if ~ else if)
 * 		- if(조건식-1){
 * 			 문장들
 * 		   }else if(조건식-2){
 * 		 	 문장들
 * 		   }else if(조건식-3){
 * 			 문장들
 * 		   }
 */

public class Exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=52;
		int value=24;
		
		if(num > value) {
			System.out.println("num > value");
		}else if(num == value) {	
			System.out.println("num == value");
		}else if(num < value) {
			System.out.println("num < value");
		}

	}

}
