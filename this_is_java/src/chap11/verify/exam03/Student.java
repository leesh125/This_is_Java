package chap11.verify.exam03;

public class Student {
	
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// String은 문자열이 같으면 동일한 객체 참조 => 동일한 해쉬코드
		return studentNum.hashCode();
	}
	
	
}
