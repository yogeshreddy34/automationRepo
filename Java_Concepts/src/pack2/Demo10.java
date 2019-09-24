package pack2;
public class Demo10 {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;//unicode
	boolean bool;
	String str;//very imp
	public void dataTypesDefaultValues() {
		System.out.println("Byte default value :"+b);
		System.out.println("short default value :"+s);
		System.out.println("int default value :"+i);
		System.out.println("long default value :"+l);
		System.out.println("float default value :"+f);
		System.out.println("double default value :"+d);
		System.out.println("char default value :"+c);
		System.out.println("boolean default value :"+bool);
		System.out.println("string default value :"+str);
	}
	public static void main(String[] args) {
		Demo10 obj=new Demo10();
		obj.dataTypesDefaultValues();
	}
}
