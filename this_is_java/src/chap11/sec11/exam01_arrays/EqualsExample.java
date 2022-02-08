package chap11.sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		int[][] original = {{1,2}, {3,4}};
		
		// 얕은 복사후 비교
		System.out.println("[얕은 복제후 비교]");
		int[][] clone1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교: " + original.equals(clone1)); // original과 clone의 번지가 같은지 비교
		System.out.println("1차 배열 항목값을 비교: " + Arrays.equals(original, clone1)); // 배열의 항목의 번지를 비교
		System.out.println("중첩 배열 항목값을 비교: " + Arrays.deepEquals(original, clone1)); // 배열의 항목의 번지뿐 아니라 그 번지에 값도 비교
		
		
		// 깊은 복사후 비교
		System.out.println("\n[깊은 복제후 비교]");
		int[][] clone2 = Arrays.copyOf(original, original.length);
		clone2[0] = Arrays.copyOf(original[0], original[0].length);
		clone2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교: " + original.equals(clone1)); 
		System.out.println("1차 배열 항목값을 비교: " + Arrays.equals(original, clone2)); 
		System.out.println("중첩 배열 항목값을 비교: " + Arrays.deepEquals(original, clone2)); 
		
		// eqaul은 1차배열의 값을 비교(참조 번지)
		// deepEqual은 2치배열의 값을 비교(안에 있는 값)
	}

}
