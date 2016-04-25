class Customer{
	private int id; // Instance Variables
	private String name;
	private String city;
	private static int counter; // Class Variable 
	// counter will come when class is loaded and class is loaded once 
	Customer(int id , String name, String city){
		System.out.println("I am Constructor and I Will Call When OBject is Created... "+counter);
		this.id = id;
		this.name = name;
		this.city = city;
		counter++;
		//System.out.println("Counter is "+counter);
	}
	
	{
		System.out.println("I am Pre Constructor Call and this is Init Block1");
	}
	
	{
		System.out.println("I am Pre Constructor Call and this is Init Block2");
	}
	
	static{
		System.out.println("I am Static Block and I Will Call Only Once When Class is Loaded..."+counter);
	}
	@Override
	public String toString(){
		return "Id "+id+" Name "+name+" City "+city;
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		Customer ram = new Customer(190,"Ram","Delhi"); // Class Load + Object Create
		Customer shyam = new Customer(200,"Shyam","Delhi");  // Object Create

	}

}
