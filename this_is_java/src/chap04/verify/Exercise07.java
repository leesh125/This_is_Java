package chap04.verify;

import java.io.IOException;
import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		
		int balance = 0;
		int deposit_num = 0;

		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {

			System.out.println("----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------");
			System.out.print("선택> ");
			
			int keyCode = scanner.nextInt();
			scanner.nextLine();
			
			if(keyCode == 1) {
				System.out.print("예금액>");
				balance += scanner.nextInt();
			}else if(keyCode == 2) {
				System.out.print("출금액>");
				deposit_num = scanner.nextInt();
				if(deposit_num <= balance) {
					balance -= deposit_num;
				}else {
					System.out.println("잔액 부족");
				}
			}else if(keyCode == 3) {
				System.out.print("잔고>");
				System.out.println(balance);
			}else if(keyCode == 4){
				run = false;
			}
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
		
	}
}
