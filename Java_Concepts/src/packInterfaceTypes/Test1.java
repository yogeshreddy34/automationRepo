package packInterfaceTypes;

public class Test1 implements B, BB{
	
	public void mul() {
		System.out.println(a*b*bb);
	}

	public static void main(String[] args) {
		Test1 obj=new Test1();
		obj.mul();
	}
}
