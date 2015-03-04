package Main;

public class Test {
	public static void main(String[] args){
		Account testAccount = new Account();
		testAccount.setId(1122);
		testAccount.setBalance(20000);
		testAccount.setAnnualInterestRate(4.5);
		
		try{
			System.out.println("Withdrawing $2,500...");
			testAccount.withdraw(2500);
			System.out.println("Withdrawing $100,000...");
			testAccount.withdraw(100000);
		}
		
		catch(InsufficientFundsException e){
			System.out.println("Transaction could not be completed. You are short $" + e.getAmount());
			e.printStackTrace();
		}
		System.out.println("Depositing $3,000...");
		testAccount.deposit(3000);
		System.out.println("Your new balance is $" + testAccount.getBalance());
	}
}
