package pack1;

public class class2 {
	// defining defAULT VALUES
	byte b;
	short s;
	boolean bool;
	

	public void y1() {
		System.out.println("byte default value:"+b);
		System.out.println("Short default value:"+s);
		System.out.println("boolean default values:"+bool);
	}
	public static void main(String[] args) {
		class2 obj=new class2();
		obj.y1();
	}
	}
