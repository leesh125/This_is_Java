package chap07.sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	// Bus가 Vehicle을 상속받고 run 메소드를 재정의했기에 bus의 run이 실행됨
		driver.drive(taxi); // 

	}

}
