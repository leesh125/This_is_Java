package chap10.sec07.user_define_exception;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBlanace() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance<money) {
			throw new BalanceInsufficientException(); // 예외 발생 시키기
		}
		balance -= money;
	}
}
