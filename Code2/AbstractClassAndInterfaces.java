abstract class Account
{
	int accountNo;
	double balance;
	void deposit(){
		System.out.println("Deposit Call");
	}
	abstract void roi();
}
class SavingAccount extends Account{
	@Override
	void roi(){
		System.out.println("SA 4% ROI");
	}
	void getROI(){
		System.out.println("Get ROI");
	}
}
class CurrentAccount extends Account{
	@Override
	void roi(){
		System.out.println("CA 3% ROI");
	}
	void odLimit(){
		System.out.println("OD Limit ");
	}
}
public class AbstractClassAndInterfaces {

	public static void main(String[] args) {
		//Account account = new Account();
		SavingAccount sa = new SavingAccount();
		//sa.deposit();
		//sa.getROI();

	}

}
