package chap03.sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
	/*
	 * int x = 5; double y = 0.0;
	 * 
	 * double z = x / y; System.out.println(Double.isInfinite(z)); // z의 값이
	 * Infinity인가 => true or false
	 * 
	 * z = x % y; System.out.println(Double.isNaN(z)); // z의 값이 NaN인가 => true or
	 * false
	 * 
	 * System.out.println(z + 2); // NaN + 2 => NaN(Infinity도 동일한 메커니즘)
	 * 
	 * if(Double.isInfinite(z) || Double.isNaN(z)) { System.out.println("값 산출 불가");
	 * } else { System.out.println(z + 2); }
	 */
		
		int x = 5;
		int y = 0;
		
		try {
			int z = x/y; // %도 동일
			System.out.println("z= " + z); // 에러 : 정수를 0으로 나누면 에러 발생
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}
		
	}

}
