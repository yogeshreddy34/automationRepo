package packAccess1;

public class Demo40 extends Demo38 {

	public void m1() {
		System.out.println(x);
		System.out.println(y);
		// System.out.println(z);
		System.out.println(a);
	}

	private void m2() {
		System.out.println(x);
		System.out.println(y);
		// System.out.println(z);
		System.out.println(a);

	}

	protected void m3() {
		System.out.println(x);
		System.out.println(y);
		// System.out.println(z);
		System.out.println(a);
	}

	void m4() {
		System.out.println(x);
		System.out.println(y);
		// System.out.println(z);
		System.out.println(a);
	}

}
