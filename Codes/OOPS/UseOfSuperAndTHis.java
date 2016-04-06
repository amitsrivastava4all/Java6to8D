class T1
{
	int x = 100;
T1(){
	System.out.println("This is T1 Default Cons");
}
T1(int x){
	this();
	System.out.println("This is T1 Param Cons");
}
}
class T2 extends T1
{
	int x = 100;
	T2(){
		super(100);
		//super();
		System.out.println("This is T2 Default Cons");
	}
	T2(int x){
		this();
		int z = super.x+this.x+x; 
		//super(100);
		System.out.println("This is T2 Param Cons "+z);
	}
}

public class UseOfSuperAndTHis {

	public static void main(String[] args) {
		T2 obj = new T2(55);

	}

}
