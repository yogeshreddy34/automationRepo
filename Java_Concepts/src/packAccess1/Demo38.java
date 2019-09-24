package packAccess1;

public class Demo38 {
	int x = 10;
	public int y = 20;
	private int z = 30;
	protected int a = 40;

	public void m1() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}

	private void m2() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);

	}
	protected void m3() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}

	void m4() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
	public static void main(String[] args) {
		Demo38 obj = new Demo38();
		obj.m4();
		obj.m1();
		obj.m2();

	}
}
