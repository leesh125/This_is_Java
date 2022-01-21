package chap03.sec03.exam04_bit_reverse;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1; // 비트 반전 연산 수행(0 ->1, 1->0) : -11
		int v3 = ~v1 + 1; // -10
		System.out.println(toBinaryString(v1) + "(십진수:" + v1 +")"); // 10이 이진 문자열로 반환
		System.out.println(toBinaryString(v2) + "(십진수:" + v2 +")");
		System.out.println(toBinaryString(v3) + "(십진수:" + v3 +")");
//		System.out.println(v2);
//		System.out.println(v3);
		
		int v4 = -10;
		int v5 = ~v4; // 9
		int v6 = ~v4 + 1; // 10
		System.out.println(toBinaryString(v4) + "(십진수:" + v4 +")");
		System.out.println(toBinaryString(v5) + "(십진수:" + v5 +")");
		System.out.println(toBinaryString(v6) + "(십진수:" + v6 +")");
//		System.out.println(v5);
//		System.out.println(v6);
		
		
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0" + str;
		}
		return str;
	}

}
