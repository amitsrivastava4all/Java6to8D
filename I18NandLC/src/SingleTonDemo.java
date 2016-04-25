import java.io.IOException;

// Singleton - Single Object 
class Printing
{
	// Eager Singleton
	//private static Printing object = new Printing() ;
	private static Printing object =null;
	private Printing(){
		
	}
	// Lazy SingleTon
	public static  Printing getObject(){
		synchronized(Printing.class){
		if(object==null){
			object =new Printing();
		}
		}
		return object;
	}
}
public class SingleTonDemo {

	public static void main(String[] args) throws IOException {
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		System.out.println(r1.totalMemory());
		System.out.println(r1.freeMemory());
		System.out.println(r1.totalMemory()-r1.freeMemory());
		System.out.println(r1.exec("calc"));
		System.out.println(r1.exec("notepad"));
		System.out.println(r1.exec("mspaint"));
		if(r1==r2){
			System.out.println("Same Ref of Runtime");
		}
		else
		{
			System.out.println("Not Same Ref of Runtime");
		}
		Printing firstObject = Printing.getObject();
		Printing secondObject = Printing.getObject();
		if(firstObject==secondObject){
			System.out.println("Ref Same");
		}
		else
		{
			System.out.println("Ref Not Same");
		}
		/*Printing p = new Printing();
		Printing p2 = new Printing();*/

	}

}
