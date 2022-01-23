package chap05.sec05.exam01_string_equals;

public class StringEqualsExapmle {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		// String은 참조 타입(주소가 같아야함)
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음"); // 동일한 문자열은 주소가 같음 
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		String strVar3 = new String("홍길동"); // new를 사용하여 새로운 String 객체 생성
		String strVar4 = new String("홍길동"); // new를 사용하여 새로운 String 객체 생성
		
		if(strVar3 == strVar4) {
			System.out.println("strVar1과 strVar2는 참조가 같음");  
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름"); // 동일한 문자열이지만 다른 객체이므로 다름
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음"); // eqauls : 동일한 문자열인지 확인(주소가 달라도 괜찮음)   
		}
	}

}
