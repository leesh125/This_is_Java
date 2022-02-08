package chap11.sec07.exam02_method;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "123456-1234567";
		
		// 문자열 0~6번 인덱스까지 잘라내기(원본 영향 x)
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		// 문자열 7번 인덱스부터 끝 인덱스까지 잘라내기(원본 영향 x)
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
