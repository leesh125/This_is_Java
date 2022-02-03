package chap09.sec02.exam01_nestedclass_object;

public class A {
	A() {
		System.out.println("A 객체가 생성됨");
	}
	
	// 중첩 클래스
	class B {
		int field1;
		// static int field2; // 인스턴스 멤버 클래스는 정적 필드 생성 X
		B() {
			System.out.println("B 객체가 생성됨");
		}
		void method1() {}
	}
	
	// 정적 멤버 클래스
	static class C {
		int field1; // 인스턴스 필드
		static int field2;
		C() {
			System.out.println("C 객체가 생성됨");
		}
		void method1() {}
		static void method2() {}	
	}
	
	void method() {
		// 로컬 클래스
		class D {
			int field1;
			// static int field2; // 로컬 클래스는 정적 필드 사용 불가
			D() {
				System.out.println("D 객체가 생성됨");
			}
			void method1() {}			
		}
		
		// 로컬 클래스는 선언된 메소드 안에서만 사용가능
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
