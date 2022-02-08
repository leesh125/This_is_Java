package chap11.sec07.exam02_method;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2)); // 대소문자 구분(false 리턴)
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		// 대소문자 구분없이 비교
		System.out.println(str1.equalsIgnoreCase(str2));
		
	}

}
