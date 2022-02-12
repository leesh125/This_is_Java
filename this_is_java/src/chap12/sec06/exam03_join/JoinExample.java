package chap12.sec06.exam03_join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join(); // sumThread가 종료할 때까지 메인 스레그 일시 정지
		} catch (InterruptedException e) {}
		
		System.out.println("1~100 합: " + sumThread.getSum());
		

	}

}
