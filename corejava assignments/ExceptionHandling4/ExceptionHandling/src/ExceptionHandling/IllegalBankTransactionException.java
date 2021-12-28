package ExceptionHandling;

public class IllegalBankTransactionException extends Exception {
	public IllegalBankTransactionException()
	{
		super();
	}
	public IllegalBankTransactionException(String msg)
	{
		super(msg);
	}

}