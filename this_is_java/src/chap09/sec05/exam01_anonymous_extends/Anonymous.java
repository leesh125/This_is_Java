package chap09.sec05.exam01_anonymous_extends;

public class Anonymous {
	
	// 필드 초기값으로 대입
	Person field = new Person() { // 익명 객체(자식 객체) 만들기
		
		String studentNo;
		
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		// 로컬 변수 값으로 대입
		Person localVar = new Person() {
			String studentNo;
			
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
