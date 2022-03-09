package chap19.sec03.exam01_direct_buffer;

import java.nio.ByteBuffer;

public class BufferSizeExample {

	public static void main(String[] args) {
		ByteBuffer directBuffer = ByteBuffer.allocateDirect(100*1024*1024);
		System.out.println("다이렉트 버퍼가 생성 되었습니다.");
		
		ByteBuffer nonDirectBuffer = ByteBuffer.allocate(100*1024*1024);
		System.out.println("넌다이렉트 버퍼가 생성 되었습니다.");
	}

}
