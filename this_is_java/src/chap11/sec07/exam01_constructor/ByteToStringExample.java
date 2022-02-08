package chap11.sec07.exam01_constructor;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 }; // 문자 코드번호
		
		// bytes 배열에 전체 항목을 문자열로 변환
		String str1 = new String(bytes); 
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4); 
		System.out.println(str2);
		
	}

}
