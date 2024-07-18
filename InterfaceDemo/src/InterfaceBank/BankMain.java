package InterfaceBank;

public class BankMain {

	public static void main(String[] args) {
		
		SavingAccount SA = new SavingAccount(2000, 20);
		SA.deposit(500);
		
		System.out.println("Saving Account Balance: "+SA.getBalance());
		
		CurrentAccount CA = new CurrentAccount(1000,100);
		CA.deposit(500);
		
		System.out.println("Saving Account Balance: "+CA.getBalance());

	}

}
