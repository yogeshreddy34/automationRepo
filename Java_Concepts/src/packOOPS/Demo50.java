package packOOPS;

public class Demo50 {
	
	//oops--4 types--depends on objects
	//abstraction, encapsulation,inheritance, polymorphism
	//inheritance-->child derived from parent.-->using extends keyword
	//polymorphsim-->one task act many or different ways-->method overloading and method overriding
	//method overloading-->method name same but method signature is different-->parent class
	//method overriding-->method signature is same-->child class
	
	//overloading
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	public void add(double x, double y) {
		System.out.println(x+y);
	}
	
	public void add(int x, int y,int z) {
		System.out.println(x+y+z);
	}
	
	public static void main(String[] args) {
		Demo50 obj=new Demo50();
		obj.add(10.9, 20);
		obj.add(1.7, 2.2);
		obj.add(1, 2, 3);
	}
	

}
