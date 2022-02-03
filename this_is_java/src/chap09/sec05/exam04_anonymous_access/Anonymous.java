package chap09.sec05.exam04_anonymous_access;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		// arg1 = 20;
		// arg2 = 20;
		
		// var1 = 30;
		// var2 = 30;
		
		Calculatable calc = new Calculatable() {

			// 익명 객체 생성
			@Override
			public int sum() {
				int res = field + arg1 + arg2 + var1 + var2;
				return res;
			}
			
		};
		
		System.out.println(calc.sum());
	}
}
