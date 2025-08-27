package ch06.inheritance;

/*
 * @날짜:2025. 8. 27.
 * @작성자:유승재
 * @설명:상속 - 함수재정의(Overriding)
 */

class Airplane{
	public void fly() {
		System.out.println("일반 비행 합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
	
	public void land() {
		System.out.println("착륙합니다.");
	}
	
}

class SupersonicAirplane extends Airplane{	//fly(), takeOff(), land()
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	private int flyMode=NORMAL;
	
	public void serFlyMode(int flyMode) {
		this.flyMode=flyMode;
	}
	
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();	// this.fly()
		}
	}
	
}

public class Exam88 {

	public static void main(String[] args) {
		SupersonicAirplane sa=new SupersonicAirplane();
		sa.takeOff();
		sa.fly();

		sa.serFlyMode(SupersonicAirplane.SUPERSONIC);
		sa.fly();
		
		sa.serFlyMode(SupersonicAirplane.NORMAL);
		sa.fly();
		
	}

}
