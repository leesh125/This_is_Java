package chap16.sec02.stream_kind;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	
	public static int sum;
		
	public static void main(String[] args) {
		// rangeClosed() : 첫번째 매개값부터 두번째 매개값까지 순차적으로 제공하는 IntStream 리턴
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);

	}

}
