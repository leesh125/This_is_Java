package chap06.sec13.exam02_constructor_access.package1;

public class A {
	
	A a1 = new A(true); // public 생성자 호출
	A a2 = new A(); // default 생성자 호출
	A a3 = new A("문자열"); // private 생성자 호출
	
	public A(boolean b) {}; // public 생성자 ( 어디에서나 호출 가능)
	A() {} // default 생성자 (같은 패키지에선 호출 가능)
	private A(String s) {} // private 생성자(본인 클래스 제외하고는 이 생성자 메서드를 호출 못함)
}
