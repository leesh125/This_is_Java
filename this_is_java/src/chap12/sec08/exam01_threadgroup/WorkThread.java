package chap12.sec08.exam01_threadgroup;

public class WorkThread extends Thread {
	// 해당 쓰레드가 들어갈 쓰레드 그룹이름, 해당 쓰레드 이름
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + "interrupted");
				break;
			}
		}
		System.out.println(getName() + " 종료됨");
	}
}
