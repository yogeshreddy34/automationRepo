package packInterface;

public class Demo62 {
	
	int z=30;
	public void x() {
		System.out.println(Demo61.y+z);
	}
	
	public static void main(String[] args) {
		Demo62 obj=new Demo62();
		obj.x();
	}

}
