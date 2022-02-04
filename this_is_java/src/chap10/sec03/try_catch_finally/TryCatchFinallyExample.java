package chap10.sec03.try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			// 뒤에 있는 문자열을 class화 하여 clazz가 참조한다.
			Class clazz = Class.forName("java.lang.String2"); // 해당 이름의 클래스가 없으면 ClassNotFound
			System.out.println("클래스를 찾았습니다.");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("프로그램을 안전하게 종료합니다.");
		}

	}

}
