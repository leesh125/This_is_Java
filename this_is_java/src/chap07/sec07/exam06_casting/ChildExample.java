package chap07.sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// parent.field2 = "data2"; // 자동 타입 변환에 의해 부모 클래스에 있는 것만 사용가능
		// parent.method3();
		
		Child child = (Child) parent; // 강제 타입 변환
		child.field2 = "data2";
		child.method3();

	}

}
