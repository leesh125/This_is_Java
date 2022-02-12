package chap12.sec09.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		// 현재 PC의 core의 수 만큼 스레드를 생성하는 스레드풀
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors() 
		);
		
		System.out.println("[작업 처리 요청]");
		Callable<Integer> task= new Callable<Integer>() {
			@Override
			public Integer call() {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				return sum;
			}
		};
		
		// 후에 get()으로 얻을 값이 Integer이기에 <> 꼭
		Future<Integer> future = executorService.submit(task); // 지연 완료 객체
		
		try {
			int sum = future.get();
			System.out.println("[처리 결과] " + sum);
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) { // 스레드가 interrupt 되었을때
			System.out.println("[예외 발생함] " + e.getMessage());
		} 
		
		executorService.shutdown();
	}

}
