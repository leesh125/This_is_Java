package chap02.sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {

		int i = 128;
		
		// .MIN_VALUE : 해당 타입의 최소 표현값, .MAX_VALUE : 해당 타입의 최대 표현값
		if( i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) { 
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		} else {
			byte b = (byte) i; // byte의 범위 : -128 ~ 127
			System.out.println(b); // -128
		}

	}

}
