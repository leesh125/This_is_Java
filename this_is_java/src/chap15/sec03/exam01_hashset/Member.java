package chap15.sec03.exam01_hashset;

import java.util.Objects;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && member.age == age;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age); // 이름과 나이로 hashcode 생성
	}
	
}
