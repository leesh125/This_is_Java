package chap03.sec04.exam04_logical;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A'; // 65
		
		if((charCode>=65) && (charCode<=90)) { // 대문자 알파벳인가?
			System.out.println("대문자");
		}
		
		if((charCode>=97) && (charCode<=122)) { // 소문자 알파벳인가?
			System.out.println("소문자");
		}
		
		if(!(charCode<48) && !(charCode>57)) { // 일의 자리 숫자인가?(0<=c<=9)
			System.out.println("0~9 숫자");
		}
		
		int value = 6;
		
		if((value % 2 ==0) | (value % 3 ==0)) {
			System.out.println("2 또는 3의 배수");
		}
		
		if((value % 2 ==0) || (value % 3 ==0)) { // || 은 | 보다 연산에 좋음(앞에게 true면 뒤에는 무시하고 참)
			System.out.println("2 또는 3의 배수");
		}
	}

}
