package chap11.sec09.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("java ");
		sb.append("Program study");
		System.out.println(sb.toString());

		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book"); // 6번째 인덱스 부터 13번째 인덱스 "전" 까지 대체
		System.out.println(sb.toString());
		
		sb.delete(4, 5); // 4번째 인덱스 부터 5번째 인덱스 "전"까지 삭제
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총 문자수: " + length);
		
		String result = sb.toString(); // 버퍼에 있는 것을 String 타입으로 리턴
		System.out.println(result);
	}

}
