package chap03.sec04.exam02_string_concat;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0; // JDK6.0
		String str2 = str1 + " 특징"; // JDK6.0 특징
		System.out.println(str2);

		String str3 = "JDK" + 3 + 3.0; // JDK33.0
		String str4 = 3 + 3.0 + "JDK"; // 6.0JDK(연산 순서 --->, 숫자가 먼저 됨)
		System.out.println(str3);
		System.out.println(str4);
	}

}
