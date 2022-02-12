package chap12.sec06.exam06_stop;

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		thread.interrupt(); // 스레드가 일시정지 상태일 떼 예외 발생시키기(main스레드가 시키는거임)
	}

}
