import java.util.Date;
class Q{
	
}
class T11
{
	int e;
	class S{
		
	}
		void disp(){
			int p=100;  // Local Var
			System.out.println(" Disp Call");
			class D //extends Q
			{
				void print(){
					//p++;
					System.out.println("D Print Call "+p);
				}
			}
			D d = new D(); // Local Var
			d.print();
		}
	
}

class ITEmployee
{
	ITDept obj;
	ITEmployee(ITDept obj){
		this.obj = obj;
		System.out.println("ITEmp Cons Call");
	}
	protected void finalize(){
		System.out.println("Employee Bye bye");
	}
}
class ITDept
{
	ITDept(){
		System.out.println("ITDept Cons Call");
	}
	protected void finalize(){
		System.out.println("Dept Bye bye");
	}
}

// Inner Class 
class ITCustomer2
{
	ITCustomer2(){
		System.out.println("IT Customer Created...");
		BankAccount2 obj = new BankAccount2();
	}
	private class BankAccount2{
		BankAccount2(){
			System.out.println("Bank Account Created..");
		}
	}
}

class ITCustomer
{
	private String name;
	private int age;
	private String city;
	ITCustomer(String name , int age , String city, double balance , int accountNo ){
		System.out.println("Customer Created....");
	this.name = name;
	this.age = age;
	this.city = city;
	BankAccount account = new BankAccount(balance,accountNo,new Date());  // Has-A RelationShip
	}
	protected void finalize(){
		System.out.println("Customer Bye bye");
	}
	
}
class BankAccount
{
	static int roi;
	double balance;
	int accountNo;
	Date acccountOpen;
	 BankAccount(double balance, int accountNo, Date accountOpen) {
		 System.out.println("Account Created...");
		this.balance = balance;
		this.accountNo=accountNo;
		this.acccountOpen=accountOpen;
	}
	void withDraw(){
		System.out.println("Account Class WithDraw");
	}
	protected void finalize(){
		System.out.println("BankAccount Bye bye");
	}
}
public class HasASDemo {

	public static void main(String[] args) {
		/*ITCustomer customer = new ITCustomer("ram",21,"delhi",9999,1010); // Has - A RelationShip
		
		customer = null;
		System.gc();*/
		//ITCustomer2 c = new ITCustomer2();
		//ITCustomer2 c  = new ITCustomer2();
		//ITCustomer2.BankAccount2 b = c.new BankAccount2();
		//ITCustomer2.BankAccount2 c = new ITCustomer2().new BankAccount2();
		/*ITDept dept = new ITDept();
		ITEmployee ram = new ITEmployee(dept);
		ram = null;
		System.gc();
		*/
		/*for(int i = 1; i<=10; i++){
			System.out.println("I Is "+i);
		}*/
		T11 obj  =new T11();
		obj.disp();

	}

}
