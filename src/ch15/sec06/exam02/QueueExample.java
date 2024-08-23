package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> message = new LinkedList<>();

		message.offer(new Message("sendMail","홍길동"));
		message.offer(new Message("sendSMS","엄복동"));
		message.offer(new Message("sendKakaotalk","장발장"));
		
		while(!message.isEmpty()) {
			Message ms = message.poll();
			switch(ms.command) {
			case "sendMail":
				System.out.println(ms.to+"님에게 메일을 보냅니다.");
				break;
			case"sendSMS":
				System.out.println(ms.to+"님에게 SMS를 보냅니다.");
				break;		
			case "sendKakaotalk":
			System.out.println(ms.to+"님에게 카톡을 보냅니다.");
			break;
		
				
			}
		}
	}

}
