class T1
{
	private final void show(){
		System.out.println("T1 Show");
	}
}
class T2 extends T1
{
	//@Override
	protected void show(){
		System.out.println("T2 Show");
	}
}
public class WeakerAccessRule {

	public static void main(String[] args) {
		

	}

}
