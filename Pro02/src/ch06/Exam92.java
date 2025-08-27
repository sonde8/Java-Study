package ch06.inheritance;

/*
 * @날짜:2025. 8. 27.
 * @작성자:유승재
 * @설명:추상클래스 (추상함수)
 * 		함수재정의 -> 추상클래스, 추상함수 -> interface
 */

abstract class Animal{
	protected String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}

class Dog extends Animal{
	public Dog() {
		super.kind="포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}


class Cat extends Animal{
	public Cat() {
		super.kind="포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}


public class Exam92 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.breath();
		dog.sound();
		
		Cat cat=new Cat();
		cat.breath();
		cat.sound();

		Animal animal=null;
		animal=new Dog();
		animal.sound();
		
		animal=new Cat();
		animal.sound();
	}

}
