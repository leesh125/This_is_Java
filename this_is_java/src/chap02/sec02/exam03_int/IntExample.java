package chap02.sec02.exam03_int;

public class IntExample {

	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = 012; // 8진수 : 10
		int var3 = 0xA; // 16진수 : 10
		
		// int var4 = 100000000000; -> int가 표현할 수 있는 범위를 초과
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}

}
