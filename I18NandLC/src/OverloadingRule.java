// Wideing
// Wrappers
// Var-Args
public class OverloadingRule {
	void show(byte x){
		System.out.println("byte");
	}
	void show(short x){
		System.out.println("short");
	}
	/*void show(Integer q){
		System.out.println("Integer");
	}*/
	void show(int ...x){
		for(int z : x){
			System.out.println(z);
		}
	}
	void show(int x){
		System.out.println("int");
	}
	/*void show(long x){
		System.out.println("long");
	}*/
	
	public static void main(String[] args) {
		Integer w = 109;
		int w1 = 109;
		OverloadingRule o = new OverloadingRule();
		o.show(10);

	}

}
