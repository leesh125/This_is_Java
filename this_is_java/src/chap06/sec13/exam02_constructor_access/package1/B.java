package chap06.sec13.exam02_constructor_access.package1;

public class B {
	A a1 = new A(true); // public 생성자 호출
	A a2 = new A(); // default 생성자 호출
	// private 생성자 호출(컴파일 에러: 다른 클래스에서 참조함)
	// A a3 = new A("문자열"); 
}
