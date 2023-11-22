package ExceptionHandlingAssignments;

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

class IllegalBankTransactionException extends Exception{
	public IllegalBankTransactionException(String msg) {
		super(msg);
	}
}

public class SavingAccount {
	
	private long id;
	private double balance;
	
	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public SavingAccount(long id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public double withdraw(double amount) throws IllegalBankTransactionException, InsufficientBalanceException {
		if(amount<0) {
			throw new IllegalBankTransactionException("Cannot withdraw a amount");
			
		}
		if(amount>balance || balance==0) {
			throw new InsufficientBalanceException("Insufficient Balance for withdraw");
			
		}
		balance-=amount;
		return amount;
	}

	public double deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			
		}
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount savingAccount=new SavingAccount(12345, 4000);
		try {
			System.out.println("Withdraw : "+savingAccount.withdraw(3000));
			
		}
		catch(InsufficientBalanceException e) {
			System.out.println("Error: "+e.getMessage());
		}
		catch(IllegalBankTransactionException e) {
			System.out.println("Error : "+e.getMessage());
		}
		
		try {
			System.out.println("Withdraw : "+savingAccount.withdraw(500));
			
		}
		catch(InsufficientBalanceException e) {
			System.out.println("Error: "+e.getMessage());
		}
		catch(IllegalBankTransactionException e) {
			System.out.println("Error : "+e.getMessage());
		}
		
		System.out.println("Current Balance is: "+savingAccount.getBalance());

	}

}
