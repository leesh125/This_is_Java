package chap07.sec08.exam02_abstract_method;

public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드
	// 추상 클래스를 상속받은 구현체들이 
	// 이 메소드에 실행내용을 각기 다른 내용으로 해야할 때
	// 추상 메소드로 선언한다.
	public abstract void sound(); 
}
