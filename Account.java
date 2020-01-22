package labpart6;

public class Account {
	double bal;
	int accnum;
	
	public Account(int accnum) {
		
		bal = 0;
		this.accnum = accnum;
	}
	
public void deposit(double depositing) {
		
		bal += depositing;
		
		System.out.println("You just deposit $" + depositing + " in your account."
				+ " You now have a total of $" + bal + " in your balance.");	
	}
	
	public void withdraw(double withdrawing) {
		
		bal -= withdrawing;
		
		System.out.println("You just withdrew $" + withdrawing + " from your account." + 
		" You now have a total of $" + bal + " in your balance.");	
	}
	
	public double getBalance() {
		
		return bal;	
	}
	
	public double getAccountNumber() {
		
		return accnum;		
	}
	
 public String toString() {
	 
	return "Your balance is: $" + String.valueOf(getBalance()) + "\n" + "Your account number is: " 
	+ String.valueOf(getAccountNumber()) + "\n";
	
	}
}
