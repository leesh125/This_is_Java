package chap02.sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result); // -4 : 0이 나올 것 같지만 float의 가수부분은 23비트이기에 형변환 과정에서 값이 손실됨

	}

}
