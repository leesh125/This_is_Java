package chap18.verify.exam11;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class ClientExample {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:\\Users\\leesh\\git\\This_is_Java\\this_is_java\\src\\chap18\\verify\\exam11\\11223659_969010503157601_4319241685982588557_n.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		byte[] fileNameBytes = fileName.getBytes("UTF-8");
		fileNameBytes = Arrays.copyOf(fileNameBytes, 100);
		os.write(fileNameBytes);
		
		System.out.println("[파일 보내기 시작] " + fileName);
		FileInputStream fis = new FileInputStream(file);
		byte[] bytes = new byte[1000];
		int readByteCount = -1;
		
		while((readByteCount = fis.read(bytes)) != -1) {
			os.write(bytes, 0, readByteCount);
		}
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}

}
