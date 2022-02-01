package chap07.sec07.exam03_field_polymorphism;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		// 모든 타이어 1회를 회전
		if(frontLeftTire.roll()==false) { // 타이어가 수명을 다 할 때
			stop();
			return 1;
		}
		if(frontRightTire.roll()==false) { // 타이어가 수명을 다 할 때
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) { // 타이어가 수명을 다 할 때
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) { // 타이어가 수명을 다 할 때
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
}
