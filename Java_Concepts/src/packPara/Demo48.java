package packPara;

public class Demo48 {
	
	
	int x=10;
	int y=20;
	//parameterless methods
	public void add() {
		System.out.println(x+y);
	}
	
	//parameterized methods
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	public static void mul(int x, int y) {
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		Demo48 obj=new Demo48();
		obj.add();
		obj.add();
		obj.add(100, 200);
	}

}
