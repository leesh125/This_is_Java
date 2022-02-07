package chap11.sec03.exam06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;

		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
			
			// Counter 객체를 쓰레기로 만듦.
			counter = null;
			
			// 쓰레기 수집기 실행 요청
			System.gc();
		}

	}

}
