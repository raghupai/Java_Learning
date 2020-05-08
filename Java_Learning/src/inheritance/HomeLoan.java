package inheritance;

class HomeLoan extends Loan {
	  HomeLoan() {
	    tenure = 5; //reusing super class member variables
	    principal = 20000;
	    interestRate = 8.5f;
	    accountNumber = "Acc12345";
	  }

	public static void main(String[] args) {
	    HomeLoan hloan = new HomeLoan();
	    double amount = hloan.calculateEMI();   // sub class Object
	                                            // invoking super class method
	    System.out.println("emi per year..." + amount);
	  }
	}
