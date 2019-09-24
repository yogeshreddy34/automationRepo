package packConditionalStatement;

public class Demo77 {
	
	//if(){}
	//if(){} else{}
	//if(){} else if(){} 
	//if(){} else if(){} else{}
	//if(){} else if(){} else if(){}
	//if(){} else if(){} else if(){} else{}
	
	public void ifExm(int a, int b) {
		if(a>b) {
			System.out.println("a is big number");
		}
		else {
			System.out.println("b is big number");
		}
	}
	
	public static void main(String[] args) {
		Demo77 obj=new Demo77();
		obj.ifExm(21, 21);
	}
	

}
