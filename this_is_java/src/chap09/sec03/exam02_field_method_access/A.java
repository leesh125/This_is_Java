package chap09.sec03.exam02_field_method_access;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C { 
		void method() {
			// field1은 A객체가 있어야 사용가능하지만 중첩 클래스인 C는 static으로 선언되어 있다.
			// field1 = 10; 
			// method1();
			
			field2 = 10;
			method2();
		}
	}
}
