import java.util.Scanner;

class Emp{
	int id;
	String name;
	Emp(){
		id = 1001;
		name="Ram";
	}
	public String toString(){
		return "Id "+id+" Name "+name;
	}
}

class LowBalanceException extends RuntimeException{ //extends Exception {
	private int amount;
	LowBalanceException(int amount){
		this.amount = amount;
	}
	public String toString(){
		return "UR Balance is LOw....."+amount;
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Amount");
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		/*try{*/
		if(amount<=0){
			throw new LowBalanceException(amount);
			
		/*}*/
		
		//	System.out.println("Some Processing ....");
		}
		/*catch(LowBalanceException e){
			//System.out.println("UR Balance is LOw.....");
		System.out.println(e);
		}*/
		Emp e = new Emp();
		System.out.println(e);
		System.out.println(e.toString());

	}

}
