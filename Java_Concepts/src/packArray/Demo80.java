package packArray;

public class Demo80 {
	
	//array-->allocate memory for multiple values
	//using any data type can define array, ex:int array, String array, char array ....etc
	//array is java class.
	
	//declaration array
	int[] x=new int[3];//x is int array and size is 3-->that to single dimension array
	//size will be 3 but -->position is 0 to 2(index)
	
	//int x[]=new int[3];
	//int []x=new int [3];
	//int[ ]x=new int[3];
	
	//initialization array
	String[] names= {"abc","lmn","xyz"};
	
	public void sArrayD() {

		x[1]=90;
		for(int i:x) {
			System.out.println(i);
		}
		
		System.out.println(names[2]);
		
		System.out.println();
		
		for(String s:names) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		Demo80 obj=new Demo80();
		obj.sArrayD();
	}
	

}
