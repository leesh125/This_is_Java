package chap07.sec07.exam05_method_polymorphism;

public class Driver {

	// 매개변수로 Vehicle을 상속 받는 모든 것들이 들어올 수 있음
	public void drive(Vehicle vehicle) { 
		vehicle.run(); // vehicle을 상속받는 클래스가 override를 했다면 자식의 run()이 실행됨
	}

}
