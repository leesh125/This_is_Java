package chap07.sec04.exam02_super;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC; 
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL; // 부모 메소드 호출을 위한 flyMode 변경
		sa.fly();
		sa.land();
	}

}
