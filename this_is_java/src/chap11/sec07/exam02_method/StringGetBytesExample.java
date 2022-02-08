package chap11.sec07.exam02_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();  // 문자열을 바이트 배열로 변환
		System.out.println("bytes1.length: " + bytes1.length); // UTF-8은 한글 한자를 3바이트로
		String str1 = new String(bytes1);
		System.out.println("byte1->String: " + str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes.length: " + bytes2.length);
			String str2 = new String(bytes1, "EUC-KR");
			System.out.println("byte1->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("byte1->String: " + str3);
		} catch (UnsupportedEncodingException e) {			
			e.printStackTrace();
		}

	}

}
