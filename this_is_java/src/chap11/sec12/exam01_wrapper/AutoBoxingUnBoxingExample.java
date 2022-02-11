package chap11.sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// 자동 언박싱: 100을 Integer객체로 생성, obj가 그 객체를 참조
		Integer obj = 100; 
		System.out.println("value: " + obj.intValue());
		
		// 대입시 자동 UnBoxing
		int value = obj;
		System.out.println("value: " + value);
		
		// 연산시 자동 UnBoxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}
