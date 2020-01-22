package labpart6;

public class Checking extends Account {
	
	double overdraft;
	
	public Checking(int accnum) {
		
		super(accnum);
		
	}

public void deposit(double deposit) {
		
		bal += deposit;
		
		double balance = bal;
		
		System.out.println("You just deposit $" + deposit + " in your account."
				+ " You now have a total of ");
		System.out.println("$" + balance + " in your balance");
	
	}
	
	public void withdraw(double withdraw) {
		
		bal -= withdraw;
		
		double balance = bal;
		
		System.out.println("You just withdrew $" + withdraw + " from your account.");
		System.out.println("You now have a total of $" + balance + " in your balance.");
		
	}
	
	public double getBalance() {
		
		double balance = super.bal;
		
		return balance;
		
	}
	
	public double getAccountNumber() {
		
		int accountNumber = super.accnum;
		
		return accountNumber;	
	}
	
	public void detectOverdraft() {
		
		double sum = bal;
		
		if(bal < 0) {
			
			for(overdraft = 0; sum < 0; overdraft++)
			 {
				
				sum = sum + 1;
				
			}
			
			System.out.println("Detected overdraft. The bank just lent you $" + overdraft);
			
		} else {
			
			System.out.println("No sign of overdraft. Good job. ");
		}
	}
}
