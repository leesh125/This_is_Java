package chap03.sec04.exam01_arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1; // literal A => 65 , 65 + 1 을 char c1에 대입하면 'B'
		System.out.println(c1);
		
		char c2 = 'A';
		// char c3 = c2 + 1; // 컴파일 에러: 산술 연산을 하면 int 값으로 연산됨
		int result = c2 + 1; // 65('A') + 1 => 66
		System.out.println(result);
		
		char c3 = (char) result; // (char) 66 => 'B'
		System.out.println(c3);
	}

}
