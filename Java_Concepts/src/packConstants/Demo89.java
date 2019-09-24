package packConstants;

public class Demo89 {
	//final-->java keyword, using this keyword can define method,variable and class
	//final-->variable value can't change, and final method can't override(final means constant)
	//final class can't extend
	//finally-->exception handling block
	//finalize-->object class method and this is garbage collector...remove unnecessary or unused memory cells
	
	

	int a=10;
	final int b=30;
	public void m() {
		a=20;
		//b=40;
		System.out.println(a);
		System.out.println(b);
	}
	
	public final void m1() {
		//method body
	}

	public static void main(String[] args) {
		Demo89 obj=new Demo89();
		obj.m();
	}
}
