package chap03.sec04.exam03_compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // 정밀도 측면에서 float와 double은 다름
		System.out.println((float)v4 == v5); // 강제 형변환을 통해 타입을 맞춤 -> true
		System.out.println((int)(v4*10) == (int)(v5*10)); // 위와 동일 -> true
	}

}
