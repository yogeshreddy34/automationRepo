package packStringAndStringBuffer;

public class Demo86 {
	//String is non primitive data type
	//String is java class
	//String is immutable string
	//immutable nothing but unchangeable 
	//String object value can't change is called immutable
	//String object can create in ways.
	
	String name="abc";
	String city=new String("Bangalore");
	
	public void m() {
		System.out.println(name);
		System.out.println(name.concat(" hi"));
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Demo86 obj=new Demo86();
		obj.m();
	}

}
