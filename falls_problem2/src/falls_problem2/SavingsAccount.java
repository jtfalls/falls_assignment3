package falls_problem2;

public class SavingsAccount {
	
	
	  private static float annualInterestRate;
	  private float savingsBalance;
	 private float monthlyInterest;
	
	 
	 
	 public SavingsAccount(float savingsBalance) {
	        this.savingsBalance = savingsBalance;
	    }

	 
	 public void calculateMonthlyInterest() {
		 
		// System.out.format(this.monthlyInterest,savingsBalance);
		 
	        this.monthlyInterest = (savingsBalance * annualInterestRate) / 12;
	        System.out.println("\n\tThe monthly interest: \n\t" + this.monthlyInterest + " (with Interest Rate of " + annualInterestRate + ")");
	        
	        
	
	        
	        }
	        
	        
	        
	        public static void modifyInterestRate(float interestRate) {
	            annualInterestRate = interestRate;
	        }
	        
	        private void calculateSavings() {
	            savingsBalance += this.monthlyInterest;
	        }
	        
	        
	        
	        public void displaySavings() {
	            calculateSavings();
	            System.out.println("\n\tThe total balance: \n\t" + savingsBalance + " (with Interest Rate of " + annualInterestRate + ')');
	        }
	     
	    
	        
	        
	 
}














