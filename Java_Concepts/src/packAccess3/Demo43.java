package packAccess3;

public class Demo43 {
	
	private int x=1;
	
	void m1() {
		System.out.println("defalut m1");
		System.out.println(x);
	}

	public void m2() {
		System.out.println("public m2");
	}
	private void m3() {
	System.out.println("private m3");	
	}
	protected void m4() {
		System.out.println("protected m4");
		m3();
	}
}
