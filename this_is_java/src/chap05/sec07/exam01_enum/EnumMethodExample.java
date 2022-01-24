package chap05.sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		
		// .name() : 열거 객체가 가진 문자열을 리턴
		String name = today.name();
		System.out.println(name); // SUNDAY
		
		int ordinal = today.ordinal(); // 전체 열거 객체중 몇번째 열거객체인지 
		System.out.println(ordinal); // 6
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		// a.compareTo(b) : a의 ordinal - b의 ordinal
		int result1 = day1.compareTo(day2); // -2
		int result2 = day2.compareTo(day1); // 2
		System.out.println(result1);
		System.out.println(result2);
		
		// 문자열 "SUNDAY"와 동일한 문자열을 가지는 열거 객체의 번지(주소)를 리턴
		Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SUNDAY || weekDay == Week.SATURDAY) {
			System.out.println("주말이군요.");
		}else {
			System.out.println("평일이군요.");
		}
		
		// .values(): 열거 타입의 모든 열거 객체들을 배열로 만들어 배열(배열의 주소)를 리턴
		Week[] days = Week.values();
		for(Week day: days) {
			System.out.println(day);
		}
	}

}
