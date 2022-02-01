package chap07.sec07.exam03_field_polymorphism;

public class Tire {
	
	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation; // roll 할때마다 누적 회전수 1 증가
		if(accumulatedRotation < maxRotation) { // 누적 회전수가 타이어 수명보다 적으면
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation));
			return true;
		} else { // 누적 회전수가 타이어 수명보다 크면(교체 필요)
			System.out.println("*** " + location + " 타이어 펑크 ***");
			return false;
		}
	}
}
