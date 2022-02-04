package chap10.sec05.try_with_resources;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception(); // 강제적으로 예외 발생시킴
			// 자동으로 close()가 실행됨
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 싱행되었습니다.");
		}

	}

}
