package packConditionalStatement;

public class TestClass {
	
	public void add(int a, int b) {
		System.out.println(a+b);
		Demo79 obj=new Demo79();
		obj.findDay(a);
	}
	
	public static void main(String[] args) {
		TestClass obj=new TestClass();
		obj.add(21, 2);
	}

}
