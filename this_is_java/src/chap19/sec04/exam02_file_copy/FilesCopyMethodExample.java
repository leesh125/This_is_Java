package chap19.sec04.exam02_file_copy;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class FilesCopyMethodExample {

	public static void main(String[] args) throws IOException {
		Path from = Paths.get("src\\chap19\\sec04\\exam02_file_copy\\11223659_969010503157601_4319241685982588557_n.jpg");
		Path to = Paths.get("src\\chap19\\sec04\\exam02_file_copy\\11223659_969010503157601_4319241685982588557_n2.jpg");
		
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("파일 복사 성공");
	}

}
