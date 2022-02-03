package chap09.sec02.exam01_nestedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		// 인스턴스 멤버 클래스: A 객체가 생성되어야 B 객체 생성 가능
		A.B b = a.new B(); 
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3; // 정적 필드는 객체 생성 안해도 사용가능
		A.C.method2();
		
		a.method();
		
	}

}
