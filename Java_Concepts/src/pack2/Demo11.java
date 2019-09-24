package pack2;

public class Demo11 {
	
	//byte,short,int,long
	byte bMin=Byte.MIN_VALUE;
	byte bMax=Byte.MAX_VALUE;
	
	short sMin=Short.MIN_VALUE;
	short sMax=Short.MAX_VALUE;
	
	int iMin=Integer.MIN_VALUE;
	int iMax=Integer.MAX_VALUE;
	
	long lMin=Long.MIN_VALUE;
	long lMax=Long.MAX_VALUE;
	
	//byte b=128;
	public void dataTypesRanges() {
		System.out.println("Byte min value is :"+bMin);
		System.out.println("Byte max value is :"+bMax);
		System.out.println("Short min value is :"+sMin);
		System.out.println("Short max value is :"+sMax);
		System.out.println("Int min value is :"+iMin);
		System.out.println("Int max value is :"+iMax);
		System.out.println("Long min value is :"+lMin);
		System.out.println("Long max value is :"+lMax);
	}
	public static void main(String[] args) {
		Demo11 obj=new Demo11();
		obj.dataTypesRanges();
	}
	

}
