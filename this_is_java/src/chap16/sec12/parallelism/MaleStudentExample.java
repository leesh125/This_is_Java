package chap16.sec12.parallelism;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("홍길동", 10, Student.Sex.MALE),
			new Student("김수애", 6, Student.Sex.FEMALE),
			new Student("신용권", 10, Student.Sex.MALE),
			new Student("박수미", 6, Student.Sex.FEMALE)
		);
		
		MaleStudent maleStudent = totalList.parallelStream() // 병렬 스트림
			.filter(s->s.getSex() == Student.Sex.MALE)
			.collect(
					() -> new MaleStudent(), // 사용자 정의 컨테이너(요소가 담길 곳)
					(r, t)->r.accumulate(t), // 컨테이너 객체(r)에 요소(t)를 수집
					(r1,r2) ->r1.combine(r2) // 컨테이너 두개를 매개값으로 받아 결합
				);
			
	maleStudent.getList().stream()
			.forEach(s->System.out.println(s.getName()));

	}

}
