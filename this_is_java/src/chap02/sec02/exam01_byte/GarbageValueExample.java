package chap02.sec02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		
		// byte 예제
		var1++;// 125 + 1
		System.out.println(var1); // 126

		var1++;// 126 + 1
		System.out.println(var1); // 127
		
		var1++;// 127 + 1
		System.out.println(var1); // -128
		
		var1 = 125;
		
		// int 예제
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + '\t' + "var2: " + var2);
		}
	}

}
