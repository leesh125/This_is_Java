package chap15.sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		// 객체는 다르지만 재정의한 메소드에 의해 동등 객체
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체 수: " + set.size()); // 1
	}
	
}
