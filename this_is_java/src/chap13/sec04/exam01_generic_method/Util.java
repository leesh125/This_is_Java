package chap13.sec04.exam01_generic_method;

public class Util {
	// 제네릭 메소드: <T>를 매개변수 타입과 리턴 타입으로 갖겠다
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
}
