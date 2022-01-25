package chap06.sec08.exam04_overloading;

public class Calculator {
	// 메소드 오버로딩 
	
	// 정사각형 넓이 구하는 메소드  
	double areaRectangle(double width) {
		return width * width;
	}
	// 직사각형 넓이 구하는 메소드 	
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
