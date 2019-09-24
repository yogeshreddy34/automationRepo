package packAccess1;

public class Demo39 {

	Demo38 obj = new Demo38();

	public void m1() {
		System.out.println(obj.x);
		System.out.println(obj.y);
		// System.out.println(obj.z);
		System.out.println(obj.a);
	}

	private void m2() {
		System.out.println(obj.x);
		System.out.println(obj.y);
		// System.out.println(obj.z);
		System.out.println(obj.a);

	}

	protected void m3() {
		System.out.println(obj.x);
		System.out.println(obj.y);
		// System.out.println(obj.z);
		System.out.println(obj.a);
	}

	void m4() {
		System.out.println(obj.x);
		System.out.println(obj.y);
		// System.out.println(obj.z);
		System.out.println(obj.a);
	}
}