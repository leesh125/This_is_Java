package chap11.sec03.exam02_hashcode;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("eqauls()");
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	// equals보다 먼저 실행됨
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		return number;
	}
	
	
}
