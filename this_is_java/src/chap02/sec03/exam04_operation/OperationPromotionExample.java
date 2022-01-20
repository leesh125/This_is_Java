package chap02.sec03.exam04_operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// byte byteValue3 = byteValue1 + byteValue2; // 컴파일 에러: 자바는 정수 연산일 경우 int 타입을 기본으로 함.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		// char charValue3 = charValue1 + charValue2; // 위와 같이 컴파일 에러 발생
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // 2가 저장(int 형이라 소수점 아래는 버려짐)
		System.out.println(intValue4); // 2
		
		int intValue5 = 10;
		// int intValue6 = 10/4.0; // 오류 :10이 double로 자동 변환됨
		double doubleValue = intValue5 / 4.0; // intValue5 가 10.0으로 변환되어 계산
		System.out.println(doubleValue); // 2,5
	}

}
