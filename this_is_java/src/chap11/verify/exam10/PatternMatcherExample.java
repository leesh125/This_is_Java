package chap11.verify.exam10;

import java.util.regex.Pattern;

public class PatternMatcherExample {

	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("가능");
		}else {
			System.out.println("불가능");
		}

	}

}
