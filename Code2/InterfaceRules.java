// Design 
interface I1
{
	void show();
}




interface I2 {
	void print();
	void show();
}
interface I3 extends I1, I2{
	void output();
}
// Design Implement
class C1  implements I3{//implements I1 , I2{

	@Override
	public void print() {
		System.out.println("C1 Print Call");
		
	}

	@Override
	public void show() {
		System.out.println("C1 Show Call");
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
