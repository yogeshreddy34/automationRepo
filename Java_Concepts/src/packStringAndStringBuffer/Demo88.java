package packStringAndStringBuffer;

public class Demo88 {
	
	String str="Hello Java";
	
	
	public void m() {
		System.out.println(str.isEmpty());
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.equals("Hello Java"));
		System.out.println(str.equalsIgnoreCase("hello java"));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 5));
	}
	
	public static void main(String[] args) {
		Demo88 obj=new Demo88();
		obj.m();
	}

}
