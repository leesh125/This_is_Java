package chap11.sec10.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// 앞자리 02 or 010
		// 중간자리 - + 숫자3개 or 4개
		// 끝자리 - + 숫자3개 or 4개
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-5678";
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		// \w+ : 한 개 이상의 알파벳 또는 숫자
		// @ : @
		// \. : .
		// (\.\w+)? : \.\w+(.+한 개 이상의 문자)이 없거나  한 번 더 올 수 있음
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}

}
