package chap12.sec06.exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify(); // 다른 스레드 실행 대기 상태로
		try {
			wait(); // 자기 자신 스레드는 일시정지
		} catch (InterruptedException e) {} 
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadA의 methodB() 작업 실행");
		notify(); // 다른 스레드 실행 대기 상태로
		try {
			wait(); // 자기 자신 스레드는 일시정지
		} catch (InterruptedException e) {} 
	}
}
