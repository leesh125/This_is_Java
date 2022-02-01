package chap07.sec06.exam01_protected_package1;

public class B {
	
	// 같은 패키지이기에 protected 허용
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
