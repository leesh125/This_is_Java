package chap16.sec04.stream_filtering;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		
		names.stream()
			.distinct() // 중복제거
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream() // 리스트의 오리지널 스트림
			.filter(n -> n.startsWith("신")) // 매개값("신")으로 주어진 요소는 true
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));

	}

}
