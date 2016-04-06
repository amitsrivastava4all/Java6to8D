class K1
{
	void show(){
		System.out.println("K1 Show");
	}
	void disp(){
		System.out.println("K1 disp");
	}
}
class K2 extends K1{
	void show(){
		System.out.println("K2 Show");
	}
	void show(int x){
		System.out.println("K2 Show Param");
	}
}
class K3 extends K1{
	void disp(){
		System.out.println("K3 disp");
	}
	void output(){
		System.out.println("K3 Output");
	}
}

public class TestUpcasting {

	public static void main(String[] args) {
		K1 obj = new K3();
		obj.disp();
		obj.show();
		if(obj instanceof K3){
		K3 e = (K3)obj;
		e.output();
		}
		

	}

}
