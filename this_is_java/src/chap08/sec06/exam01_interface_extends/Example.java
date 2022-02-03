package chap08.sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); // 인터페이스 A에는 methodA 밖에 없음
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB(); // 인터페이스 B에는 methodB 밖에 없음
		System.out.println();

		InterfaceC ic = impl; // 인터페이스 C는 인터페이스 A,B 모두 상속했기때문에 모든 메소드 사용가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
