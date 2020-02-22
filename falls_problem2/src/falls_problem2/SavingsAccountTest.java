package falls_problem2;
import javax.swing.*;    
public class SavingsAccountTest {
	
	 public static void main(String[] args) {
	      // SavingAccount.annuallInterestRate=0.25;
		 
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	        
	       SavingsAccount saver1=new SavingsAccount(2000);
	        SavingsAccount saver2=new SavingsAccount(3000);
	        
	       SavingsAccount.modifyInterestRate(4);
	         
	       saver1.calculateMonthlyInterest();
	        saver2.calculateMonthlyInterest();
	        saver1.displaySavings();
	        saver2.displaySavings();
	         
	                SavingsAccount.modifyInterestRate(5);
	        saver1.calculateMonthlyInterest();
	        saver2.calculateMonthlyInterest();
	        saver1.displaySavings();
	        saver2.displaySavings();
	           
	           
	    }

     
	        
	 
}
