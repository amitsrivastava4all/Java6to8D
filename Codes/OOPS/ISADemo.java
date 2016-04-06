// Vanilla 
// Inheritance --> Code Reuse + Polymorphism
class Account
{
	int accountNo;
	String accountHolderName;
	double balance;
	public void openAccount(){
		
	}
	public double getBalance(){
		return balance;
	}
	void withDraw(){
		System.out.println("Account Class WithDraw Call");
	}
}
class SavingAccount extends Account
{
	void roi(){
	System.out.println("4%");	
	}
}
class IciciSavingAccount extends SavingAccount{
	@Override
	void roi(){
		System.out.println("5%");
	}
}
class CurrentAccount extends Account{
	void odLimit(){
		System.out.println("Current Account has OD Limit");
	}
}
public class ISADemo {

	public static void main(String[] args) {
		IciciSavingAccount sa = new IciciSavingAccount();
		sa.withDraw();
		sa.roi();

	}

}
