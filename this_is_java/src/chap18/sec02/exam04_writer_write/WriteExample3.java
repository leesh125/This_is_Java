package chap18.sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();
		writer.write(data,1,2); // "길동"만 저장 (1인덱스부터 2개)

		writer.flush();
		writer.close();
	}

}
