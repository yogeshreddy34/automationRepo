package packLoops;

public class Demo75 {

	
	public void printTenNum(int x) {

		do {
			System.out.println("Hello");
		}while(x>10);
	}
	
	public static void main(String[] args) {
		Demo75 obj=new Demo75();
		obj.printTenNum(11);
	}
}
