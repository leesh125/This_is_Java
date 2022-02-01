package chap07.verify.exam07;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run(); // 부모 타입으로 자동 타입 변환이 되더라도 자식에서 재정의된 메소드가 있으면 그걸 실행

	}

}
