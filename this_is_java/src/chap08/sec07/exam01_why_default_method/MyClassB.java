package chap08.sec07.exam01_why_default_method;

public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
		
	}

	// 인터페이스의 default 메소드도 필요에 따라 재정의 가능
	@Override
	public void method2() {
		System.out.println("MyClassB-method2() 실행");
	}

}
