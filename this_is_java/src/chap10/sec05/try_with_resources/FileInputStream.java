package chap10.sec05.try_with_resources;

public class FileInputStream implements AutoCloseable{ // try-with-resources를 사용하기 위해 AutoCloseable 구현해야함

	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
		
	}
}
