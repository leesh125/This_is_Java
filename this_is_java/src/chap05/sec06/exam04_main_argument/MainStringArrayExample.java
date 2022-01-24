package chap05.sec06.exam04_main_argument;

public class MainStringArrayExample {

	public static void main(String[] args) {
		
		// 바이트 코드 실행시 매개변수로 들어온 두 수를 확인하여 더해주는 프로그램  
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayExample num1 num2");
			System.exit(0); // 프로그램 강제 종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

	}

}
