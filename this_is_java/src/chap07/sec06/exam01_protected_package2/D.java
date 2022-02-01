package chap07.sec06.exam01_protected_package2;

import chap07.sec06.exam01_protected_package1.A;

// 상속을 받음
public class D extends A{
	
	// D는 A의 자식 클래스여서 A의 필드 메소드,생성자,접근가능
	public D() {
		super();
		this.field = "value";
		this.method();
	}
	
	public void method() {
		this.field = "value";
		this.method();
	}
}
