package pack1;

public class Demo8 {

	// method chaining concept
	// m1 is static and m2 is non static
	public static void m1() {
		System.out.println("first");
	}

	public void m2() {
		m1();
		System.out.println("second--");
	}
	public static void main(String[] args) {
		Demo8 obj=new Demo8();
		obj.m2();
	}

}
