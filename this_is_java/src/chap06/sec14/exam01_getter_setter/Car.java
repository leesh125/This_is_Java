package chap06.sec14.exam01_getter_setter;

public class Car {
	private int speed;
	private boolean stop;
	
	// ALT + SHIFT + S + O
//	public int getSpeed() {
//		return speed;
//	}
//	
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	
//	public boolean isStop() {
//		return stop;
//	}
//	
//	public void setStop(boolean stop) {
//		this.stop = stop;
//	}

	
	
	
	public int getSpeed() {
		return speed;
	}
	
	// boolean getter 는 is로 함
	public boolean isStop(){
		return stop;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;			
		}
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) { // 만약 stop이 true라면(멈추게 지시했다면)
			speed = 0;
		}
	}
	
	
}
