package chap02.sec02.exam05_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		// 실수값 저장
		double var1 = 3.14;
		// float var2 = 3.14; -> TypeMissMatch 에러: 자바 실수 리터럴의 기본 타입은 double
		float var3 = 3.14F;
		
		// 정밀도 검사
		double var4 = 0.1234567890123456789; 
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var4);
		System.out.println(var5);
		
		// e 사용하기
		int var6 = 3000000;
		double var7 = 3e6; // 3 x 10의 6승
		float var8 = 3e6F; // 3 x 10의 6승
		double var9 = 2e-3; // 2 x 10의 -3승
		
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}

}
