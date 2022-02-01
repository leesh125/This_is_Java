package chap07.sec07.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 컴파일 에러(상속 관계에 있지 않음)
		// B b3 = e;  // e는 C를 상속받음
		// C c2 = d;  // d는 B를 상속받음

	}

}
