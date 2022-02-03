package chap08.sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); // 인터페이스에 있는 메소드만 사용가능
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();

	}

}
