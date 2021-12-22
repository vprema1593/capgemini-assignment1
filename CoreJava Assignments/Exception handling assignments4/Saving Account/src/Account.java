
public class Account {
	private int balance = 3000;



	public int balance() {
	return balance;
	}
	public class InSufficientFundException extends Exception {
	}



	public void withdraw(int amount) throws InSufficientFundException {
	if (amount > balance) {
	throw new InSufficientFundException();
	}
	balance = balance - amount;
	}



	public void deposit(int amount) {
	if (amount <= 0) {
	throw new IllegalArgumentException(String.format(
	"Invalid deposit amount %s", amount));
	}

}
}
