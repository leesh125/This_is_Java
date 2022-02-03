package chap09.sec03.exam03_localclass_access;

public class Outter {
	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner {
			void method() {
				// final을 붙이면 아래 두줄이 자동 적용됨
				// int arg = 10;
				// int localVariable = 1;
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바 8 이후(자동 final 특성이 적용)
	public void method2(final int arg) {
		final int localVariable = 1;
		class Inner {
			// 자바 8 이후아래 두줄이 자동 적용됨
			// int arg = 10;
			// int localVariable = 1;
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
