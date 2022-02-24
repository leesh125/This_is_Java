package chap16.sec09.stream_aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		/*
		 * double avg = list.stream()
		 * 			.mapToInt(Integer :: intValue) 
		 * 			.average()
		 * 			.getAsDouble(); // 결과값이 없어 오류
		 */		
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if(optional.isPresent()) { // 값이 저장되어 있는지 여부
			System.out.println("방법1_평균: " + optional.getAsDouble());
		}else {
			System.out.println("방법1_평균: 0.0");
		}
		
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0); // 값이 저장되어 있지 않을 경우 디폴트 값 지정
		System.out.println("방법2_평균: " + avg);
		
		list.add(2);
		list.add(4);
		
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a -> System.out.println("방법3_평균: " + a));

	}

}
