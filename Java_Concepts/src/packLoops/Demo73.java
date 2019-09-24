package packLoops;

public class Demo73 {
	
	//for loop
	//while loop
	//do-while-->don't use
	//for each
	
	//syntax:-->for(exp1;exp2;exp3){  //for block }
	
	//for each syntax:-->for(data type obj:array or collection){//for each block}
	
	public void printTenNum() {
		for(int x=0;x<=10;x++) {
			//System.out.println(x);
			System.out.println("hello");
		}
	}
	
	public static void main(String[] args) {
		Demo73 obj=new Demo73();
		obj.printTenNum();
	}

}
