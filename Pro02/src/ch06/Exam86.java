package ch06.inheritance;

/*
 * @날짜:2025. 8. 26.
 * @작성자:유승재
 * @설명:상속 - 함수재정의(Overriding)
 */

class DParents{
	public void aa() {}
	public void bb() {}
	public void cc() {}
	public void dd() {}
	
	public void disp() {
		System.out.println("DParents CLASS");
	}
}

class DSon extends DParents{	// aa(), bb(), cc(), dd()
	public void disp() {
		System.out.println("DSon CLASS");
	}
}

public class Exam86 {

	public static void main(String[] args) {
		DParents d=new DParents();
		d.aa();
		d.bb();
		d.cc();
		d.dd();
		d.disp();
		
		DSon s=new DSon();
		s.aa();
		s.bb();
		s.cc();
		s.dd();
		s.disp();
	}

}
