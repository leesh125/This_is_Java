package chap07.verify.exam06;

public class Child extends Parent{
	private String name;
	
	public Child() {
		// super와 this는 같이 올 수 없다. 
		// 고로 super 없이 Child("홍길동") 이 실행된다. 
		this("홍길동"); 
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		// 컴파일러가 super(); 를 호출
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
