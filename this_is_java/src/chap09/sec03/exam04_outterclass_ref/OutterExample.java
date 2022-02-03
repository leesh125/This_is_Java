package chap09.sec03.exam04_outterclass_ref;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested(); // 인스턴스 멤버 클래스
		nested.print();

	}

}
