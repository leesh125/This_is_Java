package chap16.sec02.stream_kind;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import chap16.sec01.stream_introduction.Student;

public class FromcCollectionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 10),
			new Student("신용권", 20),
			new Student("유미선", 30)
		);

		Stream<Student> stream = studentList.stream(); // 컬렉션으로부터 스트림 얻기
		stream.forEach(s -> System.out.println(s.getName()));
	}

}
