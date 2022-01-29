package chap06.verify.exam19;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.SetBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());

		account.SetBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.SetBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.SetBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
	}

}
