package chap12.sec09.exam01_execute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {

	public static void main(String[] args) throws InterruptedException {
		// 최대 스레드 개수가 2인 스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<10; i++) {
			Runnable runnable = new Runnable() { // 결과값이 없는 작업
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
					int poolSize = threadPoolExecutor.getPoolSize(); // 현져 스레드 풀에 있는 스레드의 갯수
					String threadName = Thread.currentThread().getName(); // 현재 작업을 처리중인 스레드 이름
					System.out.println("[총 스레드 개수:"+ poolSize+ "] 작업 스레드 이름: " + threadName);
					int value = Integer.parseInt("삼"); // 스레드풀의 예외처리 확인 
				}
			};
			
			// 작업 큐에 저장
			//executorService.execute(runnable); // 예외 발생시 현재 스레드 제거 후 새로운 스레드 생성
			executorService.submit(runnable); // 예외 발생시 현재 스레드 작업 종료 후 새로운 작업 실행
			Thread.sleep(10);
		}
		
		// 스레드풀 종료
		executorService.shutdown();
		
	}

}
