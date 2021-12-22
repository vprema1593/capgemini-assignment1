

package BankAccount;

public class Bank {
	private String name;
	protected double balance;
	public String getName()
	{
		return this.name;
	}

public void setName(String name)
{
	this.name=name;
	
}
public void deposite(double amount)
{
	this.balance +=amount;
}
public boolean Withdraw(double amount)
{
	if(balance>amount) {

	this.balance +=amount;
	return true;
}
	else {
		return false;
	}
}
}



package BankAccount;

public class Bank1 {

	public static void main(String[] args) {
		
		CurrentAccount c=new CurrentAccount();
		SavingAccount s=new SavingAccount();
		c.deposite(500.00);
		s.deposite(500.00);
        doWithdrawl(c);
        doWithdrawl(s);
        
	}
	public static void doWithdrawl(Bank acc)
	{
		boolean result=acc.Withdraw(1000.00);
		if(result)
		{
			System.out.println("withdraw succed");
			}else {
				System.out.println("withdraw fail");
			}
		
	}



	}





public class CurrentAccount extends Bank{
	 public boolean Withdraw(double amount)
	 {
		 balance -=amount;
		 return true;
	 }
	 public void deposite(double d)
	 {
		 
	 }


}