package packOOPS;

public class BB extends A {

	int a=1000;
	
	public void simplification() {
		B obj=new B();
		System.out.println(x+obj.y*a);
		m1();//A-->Parent
		obj.m2();//B-->Brother class
	}
}
