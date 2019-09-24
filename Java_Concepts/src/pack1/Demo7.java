package pack1;

public class Demo7 {
	
	//method chaining concept
		//m1 is non static and m2 is static
		public void m1() {
			System.out.println("first");
			
		}
		public static void m2() {
			//can't call non static members into static method without object
			Demo7 obj=new Demo7();
			obj.m1();
			System.out.println("second--");
		}
		
		public static void main(String[] args) {
			m2();
		}


}
