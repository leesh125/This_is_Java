package chap05.sec06.exam06_array_reference_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java"; // 같은 문자열일 경우 동일한 참조값을 가짐
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]); // 같은 객체를 참조(true)
		System.out.println(strArray[0] == strArray[2]); // 다른 객체를 참조(false)
		System.out.println(strArray[0].equals(strArray[2])); // 객체 내부의 문자열 비교(true)
	}

}
