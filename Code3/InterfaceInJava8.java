interface H
{
	void print();
	default void show(){
		System.out.println("H Show");
	}
}
interface R
{
	default void show(){
		System.out.println("R Show");
	}
}

class H1 implements H,R
{
	@Override
	public void show(){
		R.super.show();
		H.super.show();
	}
	public void print(){
		System.out.println("H1 Print Call");
	}
}

public class InterfaceInJava8 {

	public static void main(String[] args) {
		H1 obj = new H1();
		obj.print();
		obj.show();

	}

}
