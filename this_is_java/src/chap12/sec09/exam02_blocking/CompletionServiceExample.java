package chap12.sec09.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample {

	public static void main(String[] args) {
		// 현재 PC의 core의 수 만큼 스레드를 생성하는 스레드풀
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors() 
		);

		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);
		
		System.out.println("[작업 처리 요청]");
		for(int i=0; i<3; i++) {
			completionService.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for(int i=1; i<=10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}
		
		System.out.println("[처리 완료된 작업 확인]");
		executorService.submit(new Runnable() {
			@Override
			public void run() {
					while(true) {
					try {
						Future<Integer> future = completionService.take();// 완료된 작업을 가져오는 것은 다른 스레드에서 해줘야함
						int value = future.get();
						System.out.println("[처리 결과] " + value);
					} catch (Exception e) {
						break;
					} 
				}
			}
		});
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		executorService.shutdownNow();
	}

}
