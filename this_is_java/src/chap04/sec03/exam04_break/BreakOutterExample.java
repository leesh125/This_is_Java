package chap04.sec03.exam04_break;

public class BreakOutterExample {

	public static void main(String[] args) {
		// 중첩문에서 break는 해당 반복문만 빠져나옴
		/* 
		   중첩된 반복문에서 바깥쪽 반복문까지 한번에 종료하고자 하면,
		   Label(ex.Outter)을 붙혀 
		   break "라벨명"; 
		   을 해주면 된다.
		*/
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "_" + lower);
				if(lower=='g') {
					break Outter; // 바깥쪽 반복문도 빠져나옴
				}
			}
			
		}

		
	}

}

/*
   Output
   A_a
   A_b
   A_c
   A_d
   A_e
   A_f
   A_g
 */ 
