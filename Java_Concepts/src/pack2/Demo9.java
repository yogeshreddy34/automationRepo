package pack2;

public class Demo9 {

	// data type-->allocate memory for values-->1.primitive(8) and 2. non primitive(String,
	// array, collection.......etc)
	// variable --->allocate memory for value or address of value
	// primitive-->[byte,short,int,long(numeric values)], [float, double(floating point values)],
	// char(single character),boolean(true or false).
	
	byte b=10;//byte is data type, and b is variable, 10 is value
	
	
	public void m1() {
		System.out.println(b+100);
	}
	
	public static void main(String[] args) {
		Demo9 obj=new Demo9();
		obj.m1();
	}

}
