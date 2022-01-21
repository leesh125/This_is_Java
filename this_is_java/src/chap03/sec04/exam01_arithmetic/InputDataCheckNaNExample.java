package chap03.sec04.exam01_arithmetic;

public class InputDataCheckNaNExample {

	public static void main(String[] args) {
		String userInput = "NaN";
		
		double val = Double.valueOf(userInput); // NaN으로 변환
		
		double currentBalance = 10000.0;
		
		currentBalance = currentBalance + val; // NaN + 100 => NaN 
		System.out.println(currentBalance); 
	}

}
