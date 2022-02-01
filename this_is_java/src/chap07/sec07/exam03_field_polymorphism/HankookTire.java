package chap07.sec07.exam03_field_polymorphism;

public class HankookTire extends Tire{
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation; // roll 할때마다 누적 회전수 1 증가
		if(accumulatedRotation < maxRotation) { // 누적 회전수가 타이어 수명보다 적으면
			System.out.println(location + " HankookTire 수명: " + (maxRotation-accumulatedRotation));
			return true;
		} else { // 누적 회전수가 타이어 수명보다 크면(교체 필요)
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
