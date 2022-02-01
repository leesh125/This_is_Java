package chap07.sec03.exam01_parent_constructor_call;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name: "+ student.name); // 부모로부터 받은 필드
		System.out.println("ssn: "+ student.ssn); // 부모로부터 받은 필드
		System.out.println("studentNo: "+ student.studentNo);
	}

}
