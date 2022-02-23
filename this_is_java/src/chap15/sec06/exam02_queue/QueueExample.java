package chap15.sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail" , "홍길동"));
		messageQueue.offer(new Message("sendSMS" , "김자바"));
		messageQueue.offer(new Message("sendKakaotalk" , "안인궐"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); // 한 개의 메시지 꺼냄
			
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS을 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}

	}

}
