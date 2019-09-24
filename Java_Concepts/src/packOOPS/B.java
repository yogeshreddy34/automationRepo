package packOOPS;

public class B extends A {

	int y=100;
	
	public void m2() {
		System.out.println("hello m2..");
	}
	
	public void add() {
		System.out.println(x+y);
		m1();
	}
}
