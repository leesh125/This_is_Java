package chap06.verify.exam19;

public class Account {
	
	public static final int MIN_VALUE = 0;
	public static final int MAX_VALUE = 1000000;
	private int balance;

	public int getBalance() {
		return balance;
	}
	
	public void SetBalance(int balance) {
		if(balance < Account.MIN_VALUE || balance > Account.MAX_VALUE) {
			return;
		}
		this.balance = balance;
	}
}
