package chap07.sec08.exam01_abstract_class;

// 추상 클래스 상속은 가능
public class SmartPhone extends Phone{
	
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
