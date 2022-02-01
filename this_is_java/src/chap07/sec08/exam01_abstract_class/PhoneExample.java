package chap07.sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone은 추상클래스 이기에 new 연산자로 객체 생성 불가
		// Phone phone = new Phone(); 

		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn(); // smartPhone이 상속받은 추상 클래스 Phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
