package chap02.sec02.exam02_char;

public class CharExample {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uAC00';
		
		int uniCode = c1;
		
		System.out.println(c1); // A
		System.out.println(c2); // A
		System.out.println(c3); // A

		System.out.println(c4); // 가
		System.out.println(c5); // 가
		System.out.println(c6); // 가
		
		System.out.println(uniCode); // 65 : 'A'의 유니코드
	}

}
