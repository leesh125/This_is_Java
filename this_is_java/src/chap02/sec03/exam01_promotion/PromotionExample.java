package chap02.sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue; // 자동 형 변환 : byte -> int
		System.out.println(intValue); // 10

		char charValue = '가';
		intValue = charValue; // 자동 형 변환 : byte -> int
		System.out.println(intValue); // 44032 -> '가'의 유니코드
		
		intValue = 500;
		long longValue = intValue; // 자동 형 변환 : byte -> int
		System.out.println(longValue); // 500
		
		intValue = 200;
		double doubleValue = intValue; // 자동 형 변환 : byte -> int
		System.out.println(doubleValue); // 200.0
		
		longValue = 10000000000L;
		float floatValue = longValue; // 자동 형 변환 : float(4바이트) -> long(8바이트) = float 부동 소수점 방식이기에 더 큰 수 표현 가능
		System.out.println(floatValue); // 1.0E10
	}

}
