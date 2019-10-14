package pack1;

public class class4 {
	public void y1() {
		System.out.println("class4s4");
		
	}
	public void y2() {
		y1();
		System.out.println("class4");
		
		
	}
	public static void main(String[] args) {
		class4 obj = new class4();
		obj.y2();
	}

}
