package classObject;

class Account {
	// member data
	private double balance = 500.00;
	
	// member method
  	public double  getBalance(int x) {
  		return balance;
	  	}

	public static void main(String[] args) {
		// object creation
	    Account accnt = new Account();
	    double value = accnt.getBalance(123456);
	    System.out.println("The balance is: " + value);
	}
}
	      

