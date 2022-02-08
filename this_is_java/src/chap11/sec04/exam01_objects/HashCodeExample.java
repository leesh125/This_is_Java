package chap11.sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	
	static class Student {
		int sno;
		String name;
		
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public int hashCode() {
			// sno, name이 같은 Student객체는 동일한 해쉬값 리턴
			return Objects.hash(sno, name); // 해쉬 생성 
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student s = (Student) obj;
				if(s.sno == this.sno) {
					if(s.name.equals(this.name)) {
						return true;
					}
				}
			}
			return false;
		}
	}

}
