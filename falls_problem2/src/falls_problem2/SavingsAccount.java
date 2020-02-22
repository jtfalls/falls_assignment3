package falls_problem2;

public class SavingsAccount {
	
	
	  private static float annuallInterestRate;
	  private float savingsBalance;
	 private float monthlyInterest;
	
	 
	 
	 public SavingsAccount(float savingsBalance) {
	        this.savingsBalance = savingsBalance;
	    }

	 
	 public void calculateMonthlyInterest() {
		 
		// System.out.format(this.monthlyInterest,savingsBalance);
		 
	        this.monthlyInterest = (savingsBalance * annuallInterestRate) / 12;
	        System.out.println("\nThe monthly interest is :" + this.monthlyInterest);
	        
	        
	
	        
	        }
	        
	        
	        
	        public static void modifyInterestRate(float interestRate) {
	            annuallInterestRate = interestRate;
	        }
	        
	        private void calculateSavings() {
	            savingsBalance += this.monthlyInterest;
	        }
	        
	        
	        
	        public void displaySavings() {
	            calculateSavings();
	            System.out.println("\nThe total balance is : " + savingsBalance);
	        }
	     
	    
	        
	        
	 
}














