package ExceptionHandling;

public interface SavingsAccount {
	public void deposite(double amount) throws IllegalBankTransactionException;
	 public double withdraw(double amount) throws InsufficientBalanceException;
	 public void balanceEnquiry();


}
