package chap07.sec05.exam02_final_method;

public class SportsCar extends Car{
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/* 
	 * final 메소드는 오버라이딩 할 수 없음
	 * @Override public void stop() {
	 * 
	 * }
	 */
}
