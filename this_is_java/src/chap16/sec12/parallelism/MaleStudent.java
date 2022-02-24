package chap16.sec12.parallelism;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	private List<Student> list;
	
	public MaleStudent() {
		list = new ArrayList<Student>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}
	
	public void accumulate(Student student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}
	
	public void combine(MaleStudent other) { // 두 MaleStudent를 결합하는 메소드(병렬 처리 시에만 호출)
		list = new ArrayList<Student>();
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}
	
	public List<Student> getList() {
		return list;
	}
}
