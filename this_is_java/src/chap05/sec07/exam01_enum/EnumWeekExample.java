package chap05.sec07.exam01_enum;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// 열거 타입 변수 = 열거 타입.열거 상수
		// Week today = Week.FRIDAY; 
		Week today = null;
		
		// .getInstance() : 내 컴퓨터 현재 날짜를 calendar객체로 만들어 리턴해줌 
		Calendar cal = Calendar.getInstance(); 
		int week = cal.get(Calendar.DAY_OF_WEEK); // 오늘의 요일을 return(int로 리턴)
		System.out.println(week); // 2 (월요일)
		
		switch(week) {
		  case 1:
			  today = Week.SUNDAY;
			  break;
		  case 2:
			  today = Week.MONDAY;
			  break;
		  case 3:
			  today = Week.TUESDAY;
			  break;
		  case 4:
			  today = Week.WEDNESDAY;
			  break;
		  case 5:
			  today = Week.THURSDAY;
			  break;
		  case 6:
			  today = Week.FRIDAY;
			  break;
		  case 7:
			  today = Week.SATURDAY; // 열거 객체의 문자열 = 열거 상수의 이름
			  break; 
		}
		
		System.out.println("오늘 요일: " + today); // 열거 객체의 문자열을 출력
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}

}
