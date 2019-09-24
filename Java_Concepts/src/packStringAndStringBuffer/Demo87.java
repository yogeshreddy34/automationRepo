package packStringAndStringBuffer;

public class Demo87 {
	//StringBuffer is java class
	//String is mutable string
	//mutable nothing but changeable 
	//StringBuffer object value can change is called immutable
	//StringBuffer object can create in only one way.
	
	//StringBuffer name="abc";
	StringBuffer city=new StringBuffer("Bangalore");
	
	public void m() {
		System.out.println(city);
		System.out.println(city.append(" hi"));
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		Demo87 obj=new Demo87();
		obj.m();
	}

}
