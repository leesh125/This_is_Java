package chap07.sec03.exam01_parent_constructor_call;

public class People {
	
	public String name;
	public String ssn;
	
	// 기본 생성자 없음
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		System.out.println("부모 객체 생성 완료");
	}
	
	
}
