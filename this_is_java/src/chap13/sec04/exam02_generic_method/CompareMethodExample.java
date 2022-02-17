package chap13.sec04.exam02_generic_method;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "사과"); 
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Util.<Integer,String>compare(p1, p2); // 구체적 타입 지정(생략가능)
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		Pair<String, String> p3 = new Pair<>("user1", "홍길동"); 
		Pair<String, String> p4 = new Pair<>("user2", "홍길동");
		boolean result2 = Util.compare(p3, p4); // 구체적 타입 추정(생략가능)
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}

	}

}
