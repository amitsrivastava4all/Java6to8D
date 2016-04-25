class X
{
	int a, b,c;
}
class PlusX extends X
{
	int e,f;
}
class Z{
	
}
class P1
{
	X print(){
		System.out.println("P1 Print...");
		//X obj = new X();
		//return obj;
		return new X();
	}
}
class P2 extends P1
{
	PlusX print(){
		super.print();
		System.out.println("P2 Print...");
		return new PlusX();
	}
}
public class CoVariantRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
