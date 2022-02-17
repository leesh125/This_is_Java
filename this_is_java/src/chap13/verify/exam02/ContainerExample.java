package chap13.verify.exam02;

public class ContainerExample {

	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.setT("홍길동");
		String str = container1.getT();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.setT(6);
		int value = container2.getT();
	}

}
