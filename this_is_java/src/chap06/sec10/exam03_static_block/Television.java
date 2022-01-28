package chap06.sec10.exam03_static_block;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int from1To10Sum;
	
	// 정적 초기화 블록
	static {
		info = company + "-" + model;
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		from1To10Sum = sum;
	}
}
