package ch08.Exception;

/*
 * @날짜:2025. 9. 2.
 * @작성자:유승재
 * @설명:예외 처리 - 
 */

class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}


public class Ex05 {

	public static void main(String[] args) {

		Dog dog=new Dog();
		Cat cat=new Cat();
		
		changeAnimal(dog);
		changeAnimal(cat);
	}
	
	public static void changeAnimal(Animal animal) {	// 업캐스팅
		
		try {
			Dog dog=(Dog) animal;
		} catch (ClassCastException e) {
			System.out.println("클래스 형변환 에러 발생");
		}
		
		
		
		
//		if(animal instanceof Dog) {			// 다운캐스팅
//			Dog dog=(Dog) animal;
//		}else if(animal instanceof Cat) {	// 다운캐스팅
//			Cat cat=(Cat) animal;
//		}
	}

}
