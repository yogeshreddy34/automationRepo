package packAccess3;

public class Demo45 extends Demo43 {

	void mm1() {
		m1();
		m2();
		//m3();
		m4();
	}

	public void mm2() {
		m1();
		m2();
		//m3();
		m4();
	}

	private void mm3() {
		m1();
		m2();
		//m3();
		m4();
	}

	protected void mm4() {
		m1();
		m2();
		//m3();
		m4();
	}
	public static void main(String[] args) {
		Demo45 obj=new Demo45();
		obj.mm1();
		
	}

}
