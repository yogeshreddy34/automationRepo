package pack5;


//Demo16 is parent and Demo17 is child
public class Demo17 extends Demo16  {

	public void m2() {
		System.out.println("Hi..");
	}
	
	public static void main(String[] args) {
		Demo17 obj=new Demo17();
		obj.m1();
		obj.m2();
	}
}
