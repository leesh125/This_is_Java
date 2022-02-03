package chap08.sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television(); // Television은 RemoteControl 인터페이스의 구현 객체  
		rc = new Audio();
		
		rc.turnOn(); // 대입된 구현 객체의 메소드(인터페이스로 물려받은 재정의된 메소드) 실행
		rc.turnOff();
		// 위와 동일
		// RemoteControl rc = new Television();
		// RemoteControl rc = new Audio();
	}

}
