package chap19.sec04.exam02_file_copy;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopyExample {

	public static void main(String[] args) throws IOException {
		Path from = Paths.get("src\\chap19\\sec04\\exam02_file_copy\\11223659_969010503157601_4319241685982588557_n.jpg");
		Path to = Paths.get("src\\chap19\\sec04\\exam02_file_copy\\11223659_969010503157601_4319241685982588557_n2.jpg");
		
		FileChannel fileChannel_from = FileChannel.open(from, StandardOpenOption.READ);
		FileChannel fileChannel_to = FileChannel.open(to, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

		ByteBuffer buffer = ByteBuffer.allocateDirect(100);
		int byteCount;
		while(true) {
			buffer.clear();
			byteCount = fileChannel_from.read(buffer);
			if(byteCount == -1) break;
			buffer.flip();
			fileChannel_to.write(buffer);
		}
		
		fileChannel_from.close();
		fileChannel_to.close();
		System.out.println("파일 복사 성공");
	}

}
