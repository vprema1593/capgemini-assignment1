package ExceptionHandling;

public class HDFCBank implements SavingsAccount
{
 private double balance;
 public void deposite(double amount) throws IllegalBankTransactionException
 {
  if(amount <= 0)
  {
   throw new IllegalBankTransactionException(amount + "is not valid");
  }
  balance = balance + amount;
 }
 public double withdraw(double amount) throws InsufficientBalanceException 
 {
  if(balance < amount)
  {
   throw new InsufficientBalanceException("insufficient funds");
  }
  balance = balance - amount;
  return amount;
 }
 public void balanceEnquiry() 
 {
  System.out.println("current balance = "+ balance);
 }
}
