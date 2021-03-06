package chap09.sec03.exam04_outterclass_ref;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field); // 자기자신의 field
			this.method();
			System.out.println(Outter.this.field); 
			Outter.this.method();
		}
	}
}
