package chap11.sec11.exam01_arrays;

public class Member implements Comparable<Member>{
	String name;

	Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		// 현재 Member의 name과 매개변수로 들어온 Member의 name을 비교
		// -1 리턴: 현재 member의 name이 더 작으면
		// 0 리턴: 현재 member의 name이 매개변수 Member의 name과 같으면
		// 1 리턴: 현재 member의 name이 더 크면
		return name.compareTo(o.name);
	}
	
	
}
