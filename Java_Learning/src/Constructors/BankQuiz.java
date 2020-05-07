package Constructors;

class BankQuiz {
	String bankName, area, phoneNo;

	BankQuiz(){
		System.out.println("Banking application");
	}

	public static void main(String args[]) {
		BankQuiz bank = new BankQuiz();
		System.out.println(bank.bankName);
	}
}