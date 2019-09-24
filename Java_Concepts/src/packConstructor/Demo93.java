package packConstructor;

public class Demo93 {
	
	//constructor allocate memory for class
	//constructor name and class name must be same
	//doesn't have return type of constructor.
	//constructor share values to method
	
	int a;
	int b;
	public Demo93(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public void add(int c) {
		System.out.println(a+b+c);
	}
	public void mul(int c) {
		System.out.println(a*b*c);
	}
	
	public static void main(String[] args) {
		Demo93 obj=new Demo93(11, 22);
		obj.add(33);
		obj.mul(44);
	}
}
