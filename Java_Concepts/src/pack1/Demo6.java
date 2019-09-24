package pack1;

public class Demo6 {

	//method chaining concept
		//m1 and m2 are  static
		public static void m1() {
			System.out.println("first");
		}
		public static void m2() {
			System.out.println("second");
		}
		
		public static void main(String[] args) {
			m2();//m2 is  static
			m1();
		}

}
