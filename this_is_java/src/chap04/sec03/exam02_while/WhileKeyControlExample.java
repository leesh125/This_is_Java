package chap04.sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception{
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			// Enter키가 입력되면 캐리지리턴(13)과 라인피드(10)가 입력되므로 이 값을 제외(사실상 while문을 3번 돎)
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("---------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("---------------");
				System.out.print("선택: ");
			}
			
			// System.in.read() : 키보드로부터 입력된 키 코드를 리턴
			keyCode = System.in.read();
			
			if(keyCode == 49) { // 1을 읽었을 경우
				speed++;
				System.out.println("현재 속도= " + speed);
			}else if(keyCode == 50) { // 2을 읽었을 경우
				speed--;
				System.out.println("현재 속도= " + speed);
			} else if(keyCode == 51) { // 3을 읽었을 경우
				run = false; // while의 조건문을 false로 바꿈
			}
			
		}
		System.out.println("프로그램 종료");

	}

}
