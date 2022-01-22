package chap04.sec03.exam03_dowhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
	  System.out.println("메시지를 입력하세요.");
	  System.out.println("프로그램을 종료하려면 q를 입력하세요.");
	  
	  Scanner scanner = new Scanner(System.in);
	  String inputString;
	  
	  do { 
		  System.out.print(">");
		  inputString = scanner.nextLine(); // 문자열 입력받기
		  System.out.println(inputString);
	  }while(!inputString.equals("q")); // 입력받은 문자열이 q가 아니라면 반복
	  
	  System.out.println(); System.out.println("프로그램 종료");
		 
		
//		Scanner scanner = new Scanner(System.in);
//		
//		String inputString = scanner.nextLine(); // 키보드로 누른 문자열(엔터키를 누르기 전까지)
//		System.out.println(inputString);
	}

}
