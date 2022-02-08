package chap11.sec04.exam01_objects;

import java.util.Objects;

public class EqaulsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		// Integer는 equals를 재정의해서 다른 객체여도 정수값이 같으면 true
		System.out.println(Objects.equals(o1, o2)); // = o1.eqauls(02);
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, 02));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, 02) + "\n");
		
		Integer[] arr1 = { 1, 2};
		Integer[] arr2 = { 1, 2};
		System.out.println(Objects.equals(arr1, arr2)); // 객체 번지가 달라 false
		System.out.println(Objects.deepEquals(arr1, arr2)); // 배열 번지가 달라도 안에 항목이 같으면 true
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}

}
