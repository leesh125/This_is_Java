package chap11.sec07.exam02_method;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "1234567123456";
		System.out.println(ssn.length());
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}

}
