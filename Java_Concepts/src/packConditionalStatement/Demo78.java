package packConditionalStatement;

public class Demo78 {
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
		else if(a==b){
			System.out.println("a and b are equal");
		}
		else {
			System.out.println("b is big number");
		}
		
	}
	
	public static void main(String[] args) {
		Demo78 obj=new Demo78();
		obj.ifExm(210, 211);
	}
}
