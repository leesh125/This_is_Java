package chap12.sec09.exam03_callback;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
	private ExecutorService executorService;
	
	public CallbackExample() {
		executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
	}
	
	// 콜백 객체(스레드가 작업을 끝나게 되면 호출할 수 있는 콜백 메소드를 가진 객체)
	private CompletionHandler<Integer, Void> callback = 
			new CompletionHandler<Integer, Void>() {
			@Override
			public void completed(Integer result, Void attachment) {
				System.out.println("completed() 실행: " + result);
			}
			
			@Override
			public void failed(Throwable exc, Void attachment) {
				System.out.println("failed() 실행: " + exc.toString());
			}
	};
	
	public void doWork(String x, String y) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null);
				} catch(NumberFormatException e) {
					callback.failed(e, null);
				}
			}
			
		};
		executorService.submit(task);
	}
	
	public void finish() {
		executorService.shutdown();
	}

	public static void main(String[] args) {
		CallbackExample example = new CallbackExample();
		example.doWork("3", "3");
		example.doWork("3", "삼");
		example.finish();
		
	}

}
