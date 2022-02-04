package chap10.sec02.runtime_exception;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null; // 참조 변수 null
		System.out.println(data.toString()); // NullPointerException 발생

	}

}
