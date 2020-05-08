package inheritance;

class Loan {
	  int tenure;
	  double principal;
	  float interestRate;
	  String accountNumber;
	  public double calculateEMI(){
	      double simpleInterest = (principal*interestRate*tenure)/100;
	      double emi = (simpleInterest+principal)/tenure;
	      return emi;
	  }
	}


