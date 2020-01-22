package labpart6;

import java.util.Scanner;

public class Test {
	
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Put your account number for Checking: ");
	    Checking object2 = new Checking(input.nextInt());
	    
		System.out.println("Put your account number for Saving: ");
	    Saving object3 = new Saving(input.nextInt());
	    
	    System.out.println("Put your account number for Account: ");
	    Checking object1 = new Checking(input.nextInt());
	    
		boolean fate = true;
		boolean fate1 = true;
		boolean fate2 = true;
		boolean finalFate = true;
		
	while(fate == true) {
		
		System.out.println("1. Go to Checking");
		System.out.println("2. Go to Saving");
		System.out.println("3. Go to Account");
		System.out.println("4. Quit the program");
		
		int choices = input.nextInt();
		
		  switch(choices) {
		  
		  case 1: 
				   
			  System.out.println("You are in Checking");
			  System.out.println("1. Check balance");
			  System.out.println("2. Check account number");
			  System.out.println("3. Deposit money in your balance");
			  System.out.println("4. Withdraw money from your balance");
			  System.out.println("5. Detect overdraft ");
			  System.out.println("6. Get out from Checking");
			  
			  fate1 = true;
			  
		while(fate1 == true) {   
			
			  switch(input.nextInt()) {
		
		      case 1: System.out.println("Your balance is: " + object2.getBalance());;
		              break;
		      
		      case 2: System.out.println("Your account number is: " + object2.getAccountNumber());
		              break;
		      
		      case 3: System.out.println("How much do you want to deposit? ");
		              object2.deposit(input.nextDouble());
		              break;
		      
		      case 4: System.out.println("How much do you want to withdraw? "); 
		    	      object2.withdraw(input.nextDouble());
		              break;
		      
		      case 5: object2.detectOverdraft();
		              break;
		    	 
		      case 6: fate1 = false;
		              break;
		              
		              default: System.out.println("Wrong choice. Try again");       
		  }
       }
		break;
		
		  case 2:
				 
			  int months; 
			  System.out.println("You are in Saving");
			  System.out.println("1. Check balance");
			  System.out.println("2. Check account number");
			  System.out.println("3. Deposit money in your balance");
			  System.out.println("4. Withdraw money from your balance");
			  System.out.println("5. A prediction of the balance");
			  System.out.println("6. Get out from Saving");
			  
			  fate2 = true;
			 
		while(fate2 == true) {   
			
			  switch(input.nextInt()) {
		
		      case 1: System.out.println("Your balance is: " + object3.getBalance());;
		              break;
		      
		      case 2: System.out.println("Your account number is: " + object3.getAccountNumber());
		              break;
		      
		      case 3: System.out.println("How much do you want to deposit? ");
		              object3.deposit(input.nextDouble());
		              break;
		      
		      case 4: System.out.println("How much do you want to withdraw? "); 
		    	      object3.withdraw(input.nextDouble());
		              break;
		      
		      case 5: System.out.println("Enter how many months you want to check how much money you'll have"          
		      		  + " by then. "); 
		    	      System.out.println("You'll be earning $" + object3.prediction(months = input.nextInt())
		    	      + " in " + months + " months with an interest rate of " + 100 * object3.interest + "%" );
		              break;
		    	 
		      case 6: fate2 = false;
		              break;
		              
			    default: System.out.println("Wrong choice. Try again"); 
			    
		      }
		
	       }
		 break;
			 
		
			 
		  case 3:
			  
			  System.out.println("You are in Account");
			  System.out.println("1. Check balance");
			  System.out.println("2. Check account number");
			  System.out.println("3. Deposit money in your balance");
			  System.out.println("4. Withdraw money from your balance");
			  System.out.println("5. Get out from Account");
			  
			  finalFate = true;
			  
		while(finalFate == true) {   
			
			  switch(input.nextInt()) {
		
		      case 1: System.out.println("Your balance is: " + object1.getBalance());;
		              break;
		      
		      case 2: System.out.println("Your account number is: " + object1.getAccountNumber());
		              break;
		      
		      case 3: System.out.println("How much do you want to deposit? ");
		              object1.deposit(input.nextDouble());
		              break;
		      
		      case 4: System.out.println("How much do you want to withdraw? "); 
		    	      object1.withdraw(input.nextDouble());
		              break;
		      	 
		      case 5: finalFate = false;
		              break;
		              
			    default: System.out.println("Wrong choice. Try again"); 
			    
		      }
		
	       }
		break;
			 
			 
		   
		  case 4: 
			  fate = false;
			  
		          break;
			}
		  
		  System.out.println("Checking: \n" + object2);
		  System.out.println("Saving: \n" + object3);
		  System.out.println("Account \n" + object1);
	   }
		          
	   }
	}

	

