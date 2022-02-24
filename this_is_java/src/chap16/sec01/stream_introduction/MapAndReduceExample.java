package chap16.sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 10),
			new Student("신용권", 20),
			new Student("유미선", 30)
		);
		
		// 학생 리스트 stream에서 학생 점수만을 가진 stream 새로 생성(중간처리)  
		double avg = studentList.stream()
		.mapToInt(Student::getScore) //studentList.stream().mapToInt(s->s.getScore());
		.average()
		.getAsDouble();
		

		System.out.println("평균 점수: " + avg);
	}

}
