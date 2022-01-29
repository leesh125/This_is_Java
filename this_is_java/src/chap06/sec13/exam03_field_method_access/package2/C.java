package chap06.sec13.exam03_field_method_access.package2;

import chap06.sec13.exam03_field_method_access.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		// a.field2 = 1; // 컴파일 에러(default :같은 패키지에서만 접근 가능)
		// a.field3 = 1; // 컴파일 에러(private 필드에 접근했기에)

		a.method1();
		// a.method2(); // 컴파일 에러(default :같은 패키지에서만 접근 가능)
		// a.method3(); // 컴파일 에러(private 메서드에 접근했기에)

	}
}
