package chap18.sec04.exam02_fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {

	public static void main(String[] args)  {
		try {
			FileInputStream fis = new FileInputStream("C://Users//leesh//git//This_is_Java//this_is_java//src//chap18//sec04//exam02_fileinputstream//FileInputStreamExample.java");
			int data;
			while((data = fis.read()) != -1) {
				System.out.write(data);
			}
			
			//System.out.flush();
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
