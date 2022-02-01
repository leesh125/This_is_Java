package chap07.sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1(); // parent의 메소드1 호출
		
		parent.method2(); // 오버라이딩 된 child의 메소드2 호출
		
		// parent.method3() // 호출 불가능(Parent타입으로 변환되었기에 없는 parent에 없는 메소드는 호출 불가)
		

	}

}
