package chap18.sec02.exam02_outputstream_read;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes();
		os.write(data);
		
		os.flush(); // 버퍼에 쌓인 데이터를 강제로 출력
		os.close();
	}

}
