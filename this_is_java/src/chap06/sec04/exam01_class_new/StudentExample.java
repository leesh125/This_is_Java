package chap06.sec04.exam01_class_new;

public class StudentExample {

	public static void main(String[] args) {
		// new : 생성자를 호출해서 객체를 생성
		Student s1 = new Student(); // s1에는 하나의 Student 객체의 번지를 가짐 
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
	}

}
