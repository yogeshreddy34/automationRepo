package packLoops;

public class Demo76 {
	
	
	//array -->allocate memory for values
	
	int[] i=new int[5];//declaration
	//i int array
	//5 int array size-->index 0 to 5
	//i[0]=0;
	//i[1]=0;
	//i[2]=0;
	//i[3]=0;
	//i[4]=0;
	
	int x;
	int y=10;
	
	int[] j= {12,32,43};//initialization
	//j[0]=12;
	//j[1]=32;
	//j[2]=43;
	public void forEachExm() {
		for(int z:j) {
			System.out.println(z);
		}
	}
	
	public static void main(String[] args) {
		Demo76 obj=new Demo76();
		obj.forEachExm();
	}

}
