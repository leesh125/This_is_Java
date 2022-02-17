package chap14.sec04.exam02_local_variable;

public class UsingLocalVariable {
	
	void method(int arg) {
		int localVar = 40;
		
		// 메소드의 매개변수 또는 로컬변수를 람다식에서 사용하면 final 특성을 가짐
		// arg = 31 
		// localVar = 41;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
		};
		fi.method();
	}
}
