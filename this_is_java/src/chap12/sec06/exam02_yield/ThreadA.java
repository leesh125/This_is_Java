package chap12.sec06.exam02_yield;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			}else {
				Thread.yield(); // ThreadA보다 높거나 같은 우선순위의 쓰레드에게 실행 양보
			}
		}
		System.out.println("ThreadA 종료");
	}
}
