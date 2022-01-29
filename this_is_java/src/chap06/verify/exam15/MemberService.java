package chap06.verify.exam15;

public class MemberService {
	boolean login(String id, String passsword) {
		if(id.equals("hong") && passsword.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
