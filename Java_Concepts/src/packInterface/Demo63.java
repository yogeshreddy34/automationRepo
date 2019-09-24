package packInterface;

public class Demo63 implements Demo61 {
	
	
	int z=30;
	public void x() {
		System.out.println(y+z);
	}

	public void m2() {
		
		System.out.println(y*z);
	}
	
	public static void main(String[] args) {
		Demo63 obj=new Demo63();
		obj.x();
		//obj.m2();
		//Demo61.m2();
		Demo61 xx=new Demo63();
		xx.m2();
		
	}

}
