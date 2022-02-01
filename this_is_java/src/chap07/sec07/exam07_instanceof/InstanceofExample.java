package chap07.sec07.exam07_instanceof;
/* 
 * 강제 타입 변환(부모 클래스 -> 자식 클래스로)
 * 
 * 조건 : 자식 타입이 부모 타입으로 변환되어 있는 상태에서만 가능
 * 
 * Parent parent = new Child();
 * Child child = parent;
 * 
 */
public class InstanceofExample {

	// 매개값으로 parent 뿐만 아니라 parent를 상속받은 child도 들어올 수 있음
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method1 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child(); // Child 객체를 생성하고 Parent로 자동 타입 변환 
		method1(parentA); // 원래 Child 객체이기 때문에 메소드 안에서 Child 객체로 강제 타입 변환이 가능
		method2(parentA);

		Parent parentB = new Parent();
		method1(parentB); // instanceof로 검사를 했기 때문에 오류없음
		// method2(parentB); // 예외발생
	}

}
