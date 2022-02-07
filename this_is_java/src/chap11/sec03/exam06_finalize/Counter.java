package chap11.sec03.exam06_finalize;

public class Counter {

	private int no;

	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 fianlize()가 실행됨");
	}
}
