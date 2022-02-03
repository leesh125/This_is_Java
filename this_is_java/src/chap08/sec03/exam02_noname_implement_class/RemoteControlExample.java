package chap08.sec03.exam02_noname_implement_class;

import chap08.sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 익명 구현 객체: 추상 메소드들을 재정의 해야함
		RemoteControl rc = new RemoteControl() {

			public int volume;
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				// 현재 들어온 값이 인터페이스 상수 보다 크면
				if(volume>RemoteControl.MAX_VOLUME) { 
					this.volume = RemoteControl.MAX_VOLUME; // 10을 넘지 못하게
				} else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨: " + this.volume);
			}
			
			public void otherMethod() { /* ... */}
			
		};
		
		
		// rc.voulme; // 익명 구현 객체의 필드 메소드는 익명 구현 객체 안에서만 사용

		
		// 컴파일 하면 RemoteControl$2.class 이런식으로 바이트 코드 생성
		RemoteControl rc2 = new RemoteControl() {

			public int volume;
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				// 현재 들어온 값이 인터페이스 상수 보다 크면
				if(volume>RemoteControl.MAX_VOLUME) { 
					this.volume = RemoteControl.MAX_VOLUME; // 10을 넘지 못하게
				} else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨: " + this.volume);
			}
			
			public void otherMethod() { /* ... */}
			
		};
	}

}
