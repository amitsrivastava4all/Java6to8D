interface RR{
	default void output(){
		System.out.println("RR Output");
	}
}
interface N
{
	void print();
}
// SAM (Single Abstract Method) Interface
@FunctionalInterface
interface Calc extends RR{
	int cal(int x, int y);
}
class N1 implements N
{
	@Override
	public void print(){
		System.out.println("N1 Print Call");
	}
}
public class InterfaceUseWays {
	static void disp(){
		 int t;
		N n = new N(){
			@Override
			public void print(){
				System.out.println("Print Call of Anonymous Class");
			}
		};
		n.print();
	}

	public static void main(String[] args) {
		N obj =new N1();
		// Class Create
		// Interface Implement
		// Method override
		// Upcasting
		// Object creation
		N n = new N(){
			@Override
			public void print(){
				System.out.println("Print Call of Anonymous Class");
			}
		};
		n.print();
		//disp();
		
		
		// Lambda Java 8
		N obj2 = ()->{
			System.out.println("Print Call of Lambda");
			System.out.println("Print Call....");
		};
		obj2.print();
		Calc c = (a,b)->a+b;
		System.out.println(c.cal(100,200));

	}

}
