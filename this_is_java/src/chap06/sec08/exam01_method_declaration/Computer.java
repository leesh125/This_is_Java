package chap06.sec08.exam01_method_declaration;

public class Computer {
	// 매개변수의 수를 모를 경우, 배열타입으로 매개변수로 받음
	public int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	
	// ...= ...을 사용해서 선언하게 되면, 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값을 사용된다.
	public int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
}
