package chap06.sec10.exam02_static_member;

public class Calculator {
	// 정적 필드 (싱글톤과 비슷한 개념)
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	
}
