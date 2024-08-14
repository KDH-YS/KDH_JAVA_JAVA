package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("갤럭시","검은색");
		
		System.out.printf("모델: %s\n색상: %s\n", myPhone.model,myPhone.color);
		
		System.out.printf("와이파이 상태: %s ", myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("하이요 저 엄복동인데요");
		myPhone.sendVoice("아~네,자전거없어요");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
		
		
	}

}
