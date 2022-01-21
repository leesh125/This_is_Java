package chap03.sec03.exam01_sign;

public class SignOperationExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1);
		System.out.println(result2);
		
		short s = 100;
		// short result3 = -s; // 에러 : 부호 연산자에 연산은 int 타입으로 산출
		
		int result3 = -s;
		System.out.println(result3);

	}

}
