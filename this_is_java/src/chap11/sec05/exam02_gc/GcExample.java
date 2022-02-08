package chap11.sec05.exam02_gc;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null; // 위 객체는 쓰레기 객체
		emp = new Employee(2);
		emp = new Employee(3);

		System.out.println("emp가 최종적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc(); // 가비지 컬렉터 실행
	}

}
