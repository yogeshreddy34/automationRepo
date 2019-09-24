package packV;

public class Demo34 extends Demo32 {

	public void m1() {
		System.out.println(x + y);
	}

	public static void m2() {
		Demo32 obj = new Demo32();
		System.out.println(obj.x * y);
	}

	public static void main(String[] args) {
		Demo34 obj = new Demo34();
		obj.m1();
		m2();
	}
}
