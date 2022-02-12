package chap12.sec02.exam02_threadname;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		System.out.println("ThreadA를 생성한 스레드: " + Thread.currentThread().getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		System.out.println("ThreadB를 생성한 스레드: " + Thread.currentThread().getName());
		threadB.start();
	}

}
