package chap08.sec04.exam02_default_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null; // 인터페이스도 참조 변수이기에 null 가능
		
		rc = new Television();
		rc.turnOn();   // Television의 메소드 실행
		rc.setMute(true); // RemoteControl의 default 메소드 
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();   // Audio의 메소드 실행
		rc.setMute(true); // Audio 클래스에서 재정의한 메소드
		rc.turnOff();
	}

}
