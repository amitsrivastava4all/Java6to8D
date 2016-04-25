class A
{
	int x =1000;
	void show(){
		System.out.println("A Show "+x);
	}
}
class B extends A
{
	void show(){
		System.out.println("B Show");
	}
	void print(){
		System.out.println("B Print");
	}
}
class C extends A{
	int x = 2000;
	void show(){
		System.out.println("C Show "+this.x);
	}
	void disp(){
		System.out.println("C Disp");
	}
}
class T{
	// A obj = new B(); A obj = new C(); A obj = new A();
	void output(A obj){
		obj.show();
	}
}
public class Demo1 {

	public static void main(String[] args) {
		/*T t = new T();
		t.output(new B());
		t.output(new C());
		t.output(new A());*/
		A obj = new C();
		System.out.println(obj.x);
		obj.show();
		C c = (C)obj;
		//c.disp();

	}

}
