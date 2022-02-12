package chap12.sec07.exam01_daemon;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // main쓰레드의 daemon쓰레드로 만듦
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		System.out.println("메인 스레드 종료");

	}

}
