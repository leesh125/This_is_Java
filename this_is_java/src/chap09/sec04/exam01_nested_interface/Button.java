package chap09.sec04.exam01_nested_interface;

public class Button {
	
	// 인터페이스 타입 필드
	OnClickListener listener;
	
	// 매개변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// 구현 객체의 onClick() 메소드 호출
	void touch() {
		listener.onClick();
	}
	
	// 중첩 인터페이스
	interface OnClickListener {
		void onClick();
	}
}
