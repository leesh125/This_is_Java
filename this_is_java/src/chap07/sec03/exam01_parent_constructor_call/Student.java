package chap07.sec03.exam01_parent_constructor_call;

public class Student extends People{
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // super 호출은 자식 생성자 제일 상단에 작성되어야 함
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}

}
