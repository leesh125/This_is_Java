package chap06.sec13.exam03_field_method_access.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1; // default ( 같은 패키지에서 접근 가능)
		// a.field3 = 1; // 컴파일 에러(private 필드에 접근했기에)

		a.method1();
		a.method2(); // default ( 같은 패키지에서 접근 가능)
		// a.method3(); // 컴파일 에러(private 메서드에 접근했기에)

	}
}
