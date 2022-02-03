package chap08.sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		
		// 익명 구현 객체
		ChildInterface1 ci1 = new ChildInterface1() {

			@Override
			public void method1() {
				System.out.println("ci1-method1()");
			}

			@Override
			public void method3() {
				System.out.println("ci1-method3()");
			}
			
		};
		
		ci1.method1(); 
		ci1.method2(); // 자식 인터에서 재정의 하지 않았기에 부모 인터페이스의 default 메소드가 실행
		ci1.method3();
		System.out.println();
		
		// 익명 구현 객체
		ChildInterface2 ci2 = new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("ci2-method1()");
			}

			@Override
			public void method3() {
				System.out.println("ci2-method3()");
			}
			
		};
		
		ci2.method1(); 
		ci2.method2(); // 자식 인터에서 부모 인터의 default 메소드 재정의했기에 자식의 메소드가 실행 
		ci2.method3();
		System.out.println();

		
		
		// 익명 구현 객체
		ChildInterface3 ci3 = new ChildInterface3() {

			@Override
			public void method1() {
				System.out.println("ci3-method1()");
			}

			@Override
			public void method2() {
				System.out.println("ci3-method2()");
			}
			
			@Override
			public void method3() {
				System.out.println("ci3-method3()");
			}
		
		};
		
		ci3.method1(); 
		ci3.method2();  
		ci3.method3();
		
	}

}
