package InterfaceBank;

public class CurrentAccount implements Account{

	private double balance;
	private double overdraftLimit;
	
	
	public CurrentAccount(double balance, double interestRate) {
		super();
		this.balance = balance;
		this.overdraftLimit = overdraftLimit;
	}


	@Override
	public void deposit(double amount) {

		balance += amount;
		
	}


	@Override
	public void withdraw(double amount) {

		if(amount <= balance)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}


	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
}
