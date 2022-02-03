package chap08.sec06.exam01_interface_extends;

// InterfaceC를 사용하려면 Interface의 부모 인터페이스 A,B에 있는 추상메소드 모두 재작성해야함
public class ImplementationC implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
	
}
