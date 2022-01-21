package chap03.sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신용권";
		String strVar2 = "신용권"; // 문자열은 리터럴이 같으면 동일한 번지를 가리킴
		String strVar3 = new String("신용권");
		
		System.out.println(strVar1 == strVar2); // 번지 비교(같음)
		System.out.println(strVar1 == strVar3); // 번지 비교(다름)
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); // 문자열 자체가 같은지(true)
		System.out.println(strVar1.equals(strVar3)); // 문자열 자체가 같은지(true)

	}

}
