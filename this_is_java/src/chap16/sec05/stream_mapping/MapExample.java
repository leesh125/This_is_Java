package chap16.sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;

import chap16.sec01.stream_introduction.Student;

public class MapExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 10),
			new Student("신용권", 20),
			new Student("유미선", 30)
		);
		
		studentList.stream()
			.mapToInt(Student::getScore)//.mapToInt(s->s.getScore()):객체를 int로
			.forEach(score -> System.out.println(score));

	}

}
