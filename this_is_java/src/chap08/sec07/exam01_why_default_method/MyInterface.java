package chap08.sec07.exam01_why_default_method;

public interface MyInterface {
	public void method1();
	public default void method2() { // default: 재작성이 안되어도 됨
		System.out.println("MyInterface-method2 실행");
	}
}
