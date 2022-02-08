package chap11.sec11.exam01_arrays;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		int[] scores = { 99,97,98};
		Arrays.sort(scores); // 정렬 후 97 98 99
		// binarySearch는 정렬후에 실행
		// 정렬된 scores 배열에서 99의 index 값을 리턴
		int index = Arrays.binarySearch(scores, 99);  
		System.out.println("찾은 인덱스: " + index);

		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인덱스: " + index);
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스: " + index);
	}

}
