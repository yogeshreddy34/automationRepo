package packEncapsulation1;


public class Demo56 {
	int x = 10;
	public int y = 20;
	private int z = 30;
	protected int a = 40;

	public void mm1() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}

	private void mm2() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);

	}

	protected void mm3() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}

	void mm4() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
	
}

