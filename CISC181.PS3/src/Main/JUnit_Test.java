package Main;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnit_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBalanace() {
		Account testAccount = new Account();
		testAccount.setId(1122);
		testAccount.setBalance(20000);
		testAccount.setAnnualInterestRate(4.5);
		testAccount.deposit(3000);
		
		//What's below is total after execution
		double afterBalance = 23000;
		double sameRate = 4.5;
		int sameId = 1122;
		
		//These have to be false if NOT the same(could be done using assertTrue as well)
		assertFalse(afterBalance != testAccount.getBalance());
		assertFalse(sameRate != testAccount.getAnnualInterestRate());
		assertFalse(sameId != testAccount.getId());	
	}
	@Test
	public void testWithdraw1() throws InsufficientFundsException {
		Account testAccount = new Account();
		testAccount.setId(1122);
		testAccount.setBalance(20000);
		testAccount.setAnnualInterestRate(4.5);
		testAccount.withdraw(2500);
		
		//What's bellow is total after execution
		double afterBalance = 17500;
		double sameRate = 4.5;
		int sameId = 1122;
		
		//These have to be false if NOT the same
		assertFalse(afterBalance != testAccount.getBalance());	
		assertFalse(sameRate != testAccount.getAnnualInterestRate());
		assertFalse(sameId != testAccount.getId());
	}
	
	@Test
	public void testWithdraw2() throws InsufficientFundsException {
		Account testAccount = new Account();
		testAccount.setId(1122);
		testAccount.setBalance(20000);
		testAccount.setAnnualInterestRate(4.5);
		//This should throw automatic error in JUnit_Test
		testAccount.withdraw(50000);
	}
}
