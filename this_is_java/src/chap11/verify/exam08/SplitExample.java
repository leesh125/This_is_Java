package chap11.verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		// 방법1(split() 메소드)
		String[] tokens = str.split(",");
		for(String token: tokens) {
			System.out.println(token);
		}
		
		System.out.println();
		
		// 방법2(StringTokenizer)
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
