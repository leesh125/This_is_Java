package chap11.sec15.exam01_format;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		// 소수점 버려지고 반올림
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));

		// 빈자리는 0으로 채워짐
		df = new DecimalFormat("000000000.00000");
		System.out.println(df.format(num));
		
		// 빈자리는 안채움
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		// 빈자리는 안채움
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		// 빈자리는 안채움
		df = new DecimalFormat("########.#####");
		System.out.println(df.format(num));
		
		// 빈자리는 안채움
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		// 빈자리는 안채움
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		// 빈자리는 안채움
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		// 빈자리는 안채움
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		// 빈자리는 안채움
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		// 빈자리는 안채움
		df = new DecimalFormat("+#,###; -#,###");
		System.out.println(df.format(num));
		
		// 빈자리는 안채움
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));
		
		// 빈자리는 안채움
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
		
	}

}
