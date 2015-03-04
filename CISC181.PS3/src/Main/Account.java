package Main;
import java.util.Date;
public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	//A no-arg constructor that creates a default account.
	public Account(){
		this.dateCreated = new java.util.Date();
	}
	
	//A constructor that creates an account with the specified id and initial balance.
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	//The accessor and mutator methods for id, balance, and annualInterestRate. 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	//The accessor method for dateCreated. 
	public Date getDateCreated() {
		return dateCreated;
	}

	//A method named getMonthlyInterestRate() that returns the monthly interest rate.
	public double getMonthlyInterestRate() {
		return((this.annualInterestRate) / 12);
	}
	
	//A method named withdraw that withdraws a specified amount from the account.
	public void withdraw(double amount) throws InsufficientFundsException {
		if(balance >= amount){
			balance = balance - amount;
		}
		else{
			double amountShort = amount - balance;
			throw new InsufficientFundsException(amountShort);
		}
	}
	//A method named deposit that deposits a specified amount to the account.
	public void deposit(double amount){
		balance += amount;
	}
}
	
	

