package chap16.sec10.stream_reduce;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 92),
			new Student("신용권", 95),
			new Student("유미선", 88)
		);
		
		int sum1 = studentList.stream()
						.mapToInt(Student::getScore)
						.sum();
		
		int sum2 = studentList.stream()
				.mapToInt(Student::getScore)
				.reduce((a,b) -> a+b) // Optional 반환
				.getAsInt();
		
		int sum3 = studentList.stream()
				.mapToInt(Student::getScore)
				.reduce(0,(a,b) -> a+b); // reduce(default, _): 값이 없으면 default
	}

}
