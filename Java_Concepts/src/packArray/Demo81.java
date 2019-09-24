package packArray;

public class Demo81 {
	
	
	//two dimension declaration
	int[][] x=new int[3][2];
	
	
	//tow dimension array initialization
	int y[][]= {{11,22},{32,54},{456,567}};
	
	
	//int[][] y..
	//int [][]y..
	//int[] []y..
	//int y[][]..
	//int []y[]..
	
	
	
	public void tArrayD() {
		x[1][1]=900;
		for(int row=0;row<3;row++) {
			for(int col=0;col<2;col++) {
				System.out.println(x[row][col]);
			}
		}
	}
	
	public void tArrayI() {
		for(int row=0;row<3;row++) {
			for(int col=0;col<2;col++) {
				System.out.println(y[row][col]);
			}
		}
	}
	
	public static void main(String[] args) {
		Demo81 obj=new Demo81();
		//obj.tArrayD();
		obj.tArrayI();
	}

}
