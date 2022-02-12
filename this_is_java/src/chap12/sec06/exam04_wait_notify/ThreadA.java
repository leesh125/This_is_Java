package chap12.sec06.exam04_wait_notify;

public class ThreadA extends Thread{
	private WorkObject workObject; // 공유 객체
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}
