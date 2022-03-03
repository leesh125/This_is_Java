package chap18.verify.exam07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception {
		String filePath = "C:\\Users\\leesh\\git\\This_is_Java\\this_is_java\\src\\chap18\\verify\\exam07\\AddlineNumberExample.java";

		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		 
		int rowNumber = 0;
		String rowData;
		
		while((rowData = br.readLine()) != null) {
			System.out.println(++rowNumber + ": " + rowData);
		}
		
		br.close();
		fr.close();
		
		
	}

}
