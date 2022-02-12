package chap12.sec06.exam02_yield;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		threadA.work = false; // B에게 실행 양보 A는 대기상태 
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		threadA.work = true;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
	}

}
