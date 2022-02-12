package chap12.sec08.exam01_threadgroup;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true); // autoSaveThread를 main쓰레드의 daemon으로
		autoSaveThread.start();

		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces(); // 스택에 있는 모든 쓰레드의 정보를 가져옴
		Set<Thread> threads = map.keySet();
		
		for(Thread thread: threads) {
			System.out.println("Name: " + thread.getName()
			+((thread.isDaemon())?"(데몬)":"(주)"));
			System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
			System.out.println();
		}

	}

}
