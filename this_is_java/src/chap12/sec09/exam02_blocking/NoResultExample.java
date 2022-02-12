package chap12.sec09.exam02_blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		// 현재 PC의 core의 수 만큼 스레드를 생성하는 스레드풀
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors() 
		);

		System.out.println("[작업 처리 요청]");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				System.out.println("[처리 결과]" + sum);
			}
		};
		
		// 리턴 값이 없는 작업은 runnable을 매개변수로
		Future future = executorService.submit(runnable); // 지연 완료 객체
		
		try {
			future.get(); // runnable 객체가(작업) 작업이 끝날때까지 대기, 끝나면 Object 리턴(runnable이라 리턴이 null) 
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) { // 스레드가 interrupt 되었을때
			System.out.println("[예외 발생함] " + e.getMessage());
		} 
		
		executorService.shutdown();
	}

}
