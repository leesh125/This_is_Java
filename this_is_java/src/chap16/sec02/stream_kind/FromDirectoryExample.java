package chap16.sec02.stream_kind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\leesh\\git\\This_is_Java\\this_is_java\\src");
		// Files.list() : 디렉토리의 내용(서브 디렉토리 또는 파일 목록)을 stream으로
		Stream<Path> stream = Files.list(path); 
		stream.forEach( p -> System.out.println(p.getFileName()));
	}

}
