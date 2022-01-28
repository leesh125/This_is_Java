package chap06.sec10.exam04_static_be_careful;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
//		컴파일 에러 
//		- static으로 되어있는 method에서 인스턴스 필드,메소드를 사용하기에
//		speed = 60;
//		run();
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
