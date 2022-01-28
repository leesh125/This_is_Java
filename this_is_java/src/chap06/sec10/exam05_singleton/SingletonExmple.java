package chap06.sec10.exam05_singleton;

public class SingletonExmple {

	public static void main(String[] args) {
		/* 생성자를 private으로 했기때문
		 * Singleton obj1 = new Singleton(); 
		 * Singleton obj2 = new Singleton();
		 */
		
		// 동일한 singleton 객체를 참조함
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}
