package chap11.sec03.exam01_equals;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id =id;
	}
	
	// equals 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // equals(Member객체)이면 
			Member member = (Member) obj; // member로 타입변환 후
			if(id.equals(member.id)) { // id가 같으면
				return true; // true
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
