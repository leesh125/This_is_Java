package chap06.sec12.exam01_final;

public class Person {
	// final 필드의 초기값 주는 방법
	
	// 1. 필드 선언 시에 주는 방법
	final String nation = "Korea";
	final String ssn;
	String name;
	
	// 2. 생성자에서 주는 방법
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
