package chap08.sec02.exam03_abstract_method;

public interface RemoteControl {

	int MAX_VOLUME = 10; 
	int MIN_VOLUME = 0;

	void turnOn(); // interface에서 메소드 선언시 public abstract가 기본적으로 작성됨
	void turnOff();
	void setVolume(int volume);
}
