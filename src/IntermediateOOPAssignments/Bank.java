package IntermediateOOPAssignments;

class BankAccount{
	String accountHolder;
	double balance;
	public BankAccount(String accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	double calculateTotalCash()
	{
		return balance;
	}
}

class SavingAccount extends BankAccount{
	
	double fixedDeposit;

	public SavingAccount(String accountHolder, double balance, double fixedDeposit) {
		super(accountHolder, balance);
		this.fixedDeposit = fixedDeposit;
	}
	double calculateTotalCash()
	{
		return balance+ fixedDeposit;
	}

}

class CurrentAccount extends BankAccount{
	
	double cash;

	public CurrentAccount(String accountHolder, double balance, double cash) {
		super(accountHolder, balance);
		this.cash = cash;
	}
	
	double calculateTotalCash()
	{
		return balance+ cash;
	}
}
public class Bank {

	public static double calculateTotalCash(BankAccount...accounts) {
		double totalCash=0;
		for(BankAccount account: accounts) {
			totalCash+= account.calculateTotalCash();
			
		}
		return totalCash;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount b1=new SavingAccount("KTM", 500000, 10000);
		BankAccount b2=new CurrentAccount("Ninja", 700000, 50000);
		
		double totalCash=calculateTotalCash(b1,b2);
		System.out.println("Total Cash in your Bank Account is: "+totalCash);;

	}

}
