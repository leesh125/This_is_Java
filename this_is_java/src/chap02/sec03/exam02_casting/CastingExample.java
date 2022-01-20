package chap02.sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		
		int intValue = 44032;
		char charValue = (char) intValue; // 44032의 유니코드 값이 char로 강제 형변환
		System.out.println(charValue); // '가'
		
		long longValue = 500;
		intValue = (int) longValue; // long -> int 강제 타입 변환
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // long -> int 강제 타입 변환(정수부분만 저장)
		System.out.println(intValue); // 3
	}

}
