package chap18.sec03.exam03_scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 입력> ");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.print("정수 입력> ");
		int intInput = scanner.nextInt();
		System.out.println(intInput);
		System.out.println();
		
		
		System.out.print("실수 입력> ");
		double doubleInput = scanner.nextDouble();
		System.out.println(doubleInput);
		System.out.println();
		

	}

}
