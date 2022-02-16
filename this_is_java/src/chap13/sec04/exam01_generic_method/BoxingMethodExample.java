package chap13.sec04.exam01_generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		// 컴파일이 매개변수를 확인하고 String 객체로 유추
		Box<String> box2 = Util.boxing("홍길동"); 
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
