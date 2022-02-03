package chap08.sec03.exam03_multi_implement_class;


// 두 개의 인터페이스를 사용한다면 모든 추상 메소드를 다 구현해야함
public class SmartTelevision implements RemoteControl, Searchable{

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
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

	
}
