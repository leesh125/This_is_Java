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
	
	// 예외 발생이 되는 메소드에 throws가 있어서 withdraw()를 호출하는 곳에서 try catch를 필수 작성해야함
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance<money) {
			throw new BalanceInsufficientException("잔고부족:" + (money-balance) + " 모자람"); // 예외 발생 시키기
		}
		balance -= money;
	}
}
