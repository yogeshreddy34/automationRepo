package packExceptionsHandling;

public class Demo85 {

	// exception-->run time issue is called exception
	// how to handle exceptions-->using try, catch,and finally(optional)
	// throw(optional for customized exception) and throws

	// two types exceptions-->checked exception(IOException....etc) and unchecked
	// exception(arithmetic exception.....etc)

	int a = 10;
	int b = 10;
	
	int[] x= {12,32,43};

	//compile time error--> syntax error
	public void div() throws InterruptedException {
		System.out.println("hello");
		try {
		System.out.println(a / b);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		//optional
		finally {
			System.out.println("i will execute every time");
		}
		System.out.println("hi");
		Thread.sleep(5000);//compile exception(compile time issue)-->checked exception, run time exception-->unchecked exception
		try {
		System.out.println(x[1]);
		}catch(Exception ex) {
			
		}

	}

	public static void main(String[] args) throws InterruptedException {
		Demo85 obj = new Demo85();
		obj.div();
	}
}
