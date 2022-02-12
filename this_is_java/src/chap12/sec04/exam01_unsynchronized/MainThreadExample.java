package chap12.sec04.exam01_unsynchronized;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator caculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(caculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(caculator);
		user2.start();
	}

}
