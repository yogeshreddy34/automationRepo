package packV;

public class Demo33 {

	public void m1() {
		Demo32 obj = new Demo32();
		System.out.println(obj.x + Demo32.y);
	}

	public static void main(String[] args) {
		Demo33 obj = new Demo33();
		obj.m1();
	}
}
