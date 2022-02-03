package chap08.sec04.exam01_abstract_method_use;

// 인터페이스의 실제 구현 객체는 인터페이스의 추상 메소드를 모두 재정의 작성 해야한다.
public class Television implements RemoteControl{

	private int volume;
	
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
	
}
