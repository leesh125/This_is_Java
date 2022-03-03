package chap18.sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		
//		while((readByteNo = is.read(readBytes)) != -1 ) {
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			// readBytes의 0번째 인덱스부터 readByteNo까지 문자열로
			data += new String(readBytes, 0, readByteNo); 
		}
		System.out.println(data);
		is.close();
	}
	
}
