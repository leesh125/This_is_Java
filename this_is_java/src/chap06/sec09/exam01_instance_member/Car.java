package chap06.sec09.exam01_instance_member;

public class Car {
	
	// 인스턴스 필드
	String model;
	int speed;
	
	Car(String model){
		this.model = model; // this를 사용하여 인스턴스 필드임을 알려줌
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			this.setSpeed(i); // setSpped(i) 해도 동일
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}
}
