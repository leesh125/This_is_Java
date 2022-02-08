package chap11.sec07.exam01_constructor;

import java.io.IOException;

public class KeyBoardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		// 키보드로 부터 입력 받은 값을 bytes 배열에 저장
		int readByteNo = System.in.read(bytes);

		String str = new String(bytes, 0, readByteNo-2); // enter키 제거 (-2)
		System.out.println(str);
	}

}
