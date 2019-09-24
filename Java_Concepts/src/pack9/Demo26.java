package pack9;

public class Demo26 {

	public void m3() {
		System.out.println("Hi....n s m3");
		Demo25 obj = new Demo25();
		obj.m1();
		Demo25.m2();// class name for static methods
	}

	public static void m4() {
		System.out.println("Hi.... s m4");
		Demo25 obj = new Demo25();
		obj.m1();
		Demo25.m2();
	}

	public static void main(String[] args) {
		m4();// 3
		Demo26 obj = new Demo26();
		obj.m3();// 3
	}
}
