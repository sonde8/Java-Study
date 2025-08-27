package ch06.inheritance;

/*
 * @날짜:2025. 8. 26.
 * @작성자:유승재
 * @설명:상속
 */

class Car{
	public String model;
	public String color;
	public void disp() {
		System.out.println("Car disp...");
	}
}

class SportsCar extends Car{	// model, color, disp()
	public int maxSpeed;		// maxSpeed, output()
	public void output() {
		System.out.println(model + "\t" + color + "\t" + maxSpeed);
	}
}


public class Exam81 {

	public static void main(String[] args) {
		Car car=new Car();	// model, color, disp()
		
		SportsCar sp=new SportsCar();	// model, color, disp(), maxSpeed, output()
		sp.model="volvo xc90";
		sp.color="white";
		sp.maxSpeed=200;
		sp.disp();
		sp.output();
	}

}
