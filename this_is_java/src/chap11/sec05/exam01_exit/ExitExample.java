package chap11.sec05.exam01_exit;

public class ExitExample {

	public static void main(String[] args) {
		// 보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) { // System.exit() 시에 실행되는 함수
				if(status!=5) { // 5가 아닐경우엔
					throw new SecurityException(); // 종료가 아닌 예외처리
				}
			}
		});
		
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			try {
				System.exit(i); // JVM 종료 요청
			} catch(SecurityException e) {}
				
			
		}

	}

}
