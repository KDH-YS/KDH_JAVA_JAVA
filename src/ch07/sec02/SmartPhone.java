package ch07.sec02;

public class SmartPhone extends Phone {
	public boolean signal;
	public String wifi = signal?"신호있음":"신호없음";
	public SmartPhone(String model,String color) {
		this.model = model;
		this.color = color;
		
	}
	
	public void setWifi(boolean signal) {
		this.signal = signal;
		System.out.println("와이파이 연결");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다");
	}
	
}
