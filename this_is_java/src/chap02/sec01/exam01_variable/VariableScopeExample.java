package chap02.sec01.exam01_variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		int var1;
		
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
		}
		
		var1 = 10;
		// var2 = 20;  -> 변수는 선언된 블록 내에서만 사용이 가능
		
		for(int i=0; i<1; i++) {
			int var3;
			
			var1 = 10;
			var3 = 30;
		}
		
		var1 = 10;
		// var3 = 30; -> 변수는 선언된 블록 내에서만 사용이 가능
	}

}