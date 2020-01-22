package labpart6;

public class Saving extends Account {
	double interest;

	public Saving(int accnum) {
		
		super(accnum);
	    interest = 0.08;
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
	
	public double prediction(double month) {
		
		double convertToYear = month/12;
		return getBalance() * Math.pow ((1 + interest), convertToYear);	
	}
}
