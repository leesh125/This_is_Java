package chap13.verify.exam03;

public class ContainerExample {

	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.setT("홍길동", "도적");
		String job = container1.getKey();
		
		Container<String, Integer> container2 = new Container<>();
		container2.setT("홍길동", 35);
		String name2= container1.getKey();
		int age = container2.getValue();

	}

}
