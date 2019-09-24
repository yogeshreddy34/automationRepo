package pack1;

public class Demo4 {
	
	//non static method--non static method will be stored into stack memory-->required object
	public void m1() {
		System.out.println("Hello Yogesh....");
	}
	
	//static method ---static method will be stored into heap memory-->doesn't required object
	public static void m2() {
		System.out.println("Hello Yogesh Kumar....");
	}
	
	public static void main(String[] args) {
		Demo4 obj=new Demo4();
		  obj.m1();
		//m1();//getting compile time error.
		m2();
	}
  
}
