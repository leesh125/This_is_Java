package chap09.sec04.exam01_nested_interface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();

		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		btn.setOnClickListener(new Button.OnClickListener() {
			// 익명 객체
			@Override 
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		btn.touch();
	}

}
