package chap06.sec13.exam02_constructor_access.package2;

import chap06.sec13.exam02_constructor_access.package1.A;

public class C {
	A a1 = new A(true); // public 생성자 호출
	// 다른 패키지에서 접근 못함
	// A a2 = new A(); // default 생성자 호출(컴파일 에러)
	// 다른 패키지, 다른 클래스에서 접근 못함
	// A a3 = new A("문자열"); // private 생성자 호출(컴파일 에러)
}
