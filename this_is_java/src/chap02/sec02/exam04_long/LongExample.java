package chap02.sec02.exam04_long;

public class LongExample {

	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L; // L : 컴파일러야 8바이트로 인식해라
		
		// long var3 = 100000000000; // 컴파일 에러 : 4바이트로 인식하기에 
		
		long var4 = 100000000000L; // L 표시로 8바이트로 인식
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}

}
