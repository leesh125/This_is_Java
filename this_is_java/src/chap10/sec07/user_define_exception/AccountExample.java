package chap10.sec07.user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();

		// 예금하기
		account.deposit(10000);
		System.out.println("예금액:" + account.getBlanace());
		
		// 출금하기
		try {
			account.withdraw(102310);
			System.out.println("예금액:" + account.getBlanace());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage(); // 생성한 예외 메시지
			System.out.println(message); 
			System.out.println();
			e.printStackTrace();
			System.out.println();
			System.out.println(e.toString());
		}

	}

}
