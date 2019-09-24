package packOOPS;

public class Demo52 extends Demo51{

	
	public void bikeHP(int hp) {
		System.out.println("child implementation "+hp);
	}
	
	
	public static void main(String[] args) {
		//child object
		Demo52 obj=new Demo52();
		obj.bikeHP(150);
		
		//parent object
		Demo51 obj1=new Demo51();
		obj1.bikeHP(100);
	}
}
