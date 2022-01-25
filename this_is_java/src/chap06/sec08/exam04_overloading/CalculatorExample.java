package chap06.sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(10);
		
		double result2 = myCalc.areaRectangle(10, 20);

		System.out.println("정사각형의 넓이는 = " + result1);
		System.out.println("직사각형의 넓이는 = " + result2);
	}

}
