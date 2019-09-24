package pack8;

public class Demo24 extends Demo23 {

	public void m3() {
		System.out.println("Hi....n s m3");
		m1();
		m2();
	}

	public static void m4() {
		System.out.println("Hi.... s m4");
		Demo23 obj = new Demo23();
		obj.m1();
		m2();
	}

	public static void main(String[] args) {
		m4();
		// Demo24 obj=new Demo24();
		// obj.m3();
	}

}
