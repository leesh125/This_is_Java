package chap16.sec11.stream_collector;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
			new Student("김수애", 6, Student.Sex.FEMALE, Student.City.Busan),
			new Student("신용권", 10, Student.Sex.MALE, Student.City.Busan),
			new Student("박수미", 6, Student.Sex.FEMALE, Student.City.Seoul)
		);
		
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex)); // key를 학생들의 성별로

		System.out.print("[남학생] ");
		mapBySex.get(Student.Sex.MALE).stream() // 키로 성별(enum) 값으로 남학생 List 
			.forEach(s->System.out.print(s.getName() + " "));
		
		System.out.print("\n[여학생] ");
		mapBySex.get(Student.Sex.FEMALE).stream() // 키로 성별(enum) 값으로 남학생 List 
			.forEach(s->System.out.print(s.getName() + " "));
		
		System.out.println();
		
		Map<Student.City, List<String>> mapByCity = totalList.stream()
				.collect(
					Collectors.groupingBy(
						Student::getCity, // key
						Collectors.mapping(Student::getName, Collectors.toList()) // value: 학생들의 이름을 list로
					)
				);
		System.out.print("\n[서울] ");
		mapByCity.get(Student.City.Seoul).stream()
			.forEach(name -> System.out.print(name + " "));
		
		System.out.print("\n[부산] ");
		mapByCity.get(Student.City.Busan).stream()
			.forEach(name -> System.out.print(name + " "));
		
				
	}

}
