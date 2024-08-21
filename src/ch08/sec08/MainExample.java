package ch08.sec08;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rcTV = new TV();
		rcTV.turnOn();
		rcTV.turnOff();
		
		SmartTV rcSTV = new SmartTV();
		rcSTV.turnOn();
		rcSTV.search(null);
	}

}
