package chap03.sec04.exam01_arithmetic;

public class CheckOverflowExample {

	public static void main(String[] args) {
		
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}
	
	public static int safeAdd(int left, int right) {
		
		if(right > 0) {
			// left + right > Integer.MAX_VALUE 와 같음 (left + right를 먼저 수행하여 이미 쓰레기 값이 들어가기에 아래와 같이 작성)
			if(left > (Integer.MAX_VALUE-right)) {  
				throw new ArithmeticException("오버플로우 발생!");
			}
		}else {
			if(left < (Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생!");
			}
		}
		
		return left + right;
	}

}
