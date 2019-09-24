package pack1;

public class Demo5 {
	
	//method chaining concept
	//m1 and m2 are non static
	public void m1() {
		System.out.println("first");
	}
	public void m2() {
		m1();
		System.out.println("second");
	}
	
	
	public static void main(String[] args) {
		//m1 and m2 are non static methods
		Demo5 obj=new Demo5();
		//obj.m1();
		obj.m2();//m2 is non static
	}

}
