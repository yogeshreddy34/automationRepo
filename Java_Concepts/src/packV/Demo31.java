package packV;

public class Demo31 {

	// local variable, global variable and class or static variable.

	// local-->inside the method
	// global-->inside the class and outside the methods
	// static or class -->if have static keyword in global

	// global
	int x = 10;// x is variable,int is data type and 10 is value.
	//static or class
	static int z = 30;
	
	//non static method-->access static and non static members
	//static method-->only can access static members.--->for non static have to create object.

	public void m1() {
		// local
		int y = 20;
		System.out.println(x + y+z);

	}

	public void m2() {
		// System.out.println(x+y);
		System.out.println(x);
		System.out.println(z);
		//System.out.println(y);
		
	}
	public static void main(String[] args) {
		Demo31 obj = new Demo31();
		obj.m1();
		obj.m2();
	}

}
