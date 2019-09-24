package packConditionalStatement;

public class Demo79 {

	public void findDay(int x) {
		switch (x) {
		case 1:
			System.out.println("sun");
			System.out.println("i am in hyd");
			break;
		case 2:
			System.out.println("mon");
			System.out.println("i am in chn");
			break;
		case 3:
			System.out.println("tue");
			System.out.println("i am in bng");
			break;
		case 4:
			System.out.println("wen");
			break;

		default:
			System.out.println("sat or fri");
			System.out.println("i am in home town");
			break;

		}
	}
	
	public static void main(String[] args) {
		Demo79 obj=new Demo79();
		obj.findDay(11);
	}

}
