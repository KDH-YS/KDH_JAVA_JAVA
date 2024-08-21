package ch08.sec08;

public class SmartTV implements Searchable, RemoteControl {

	@Override
	public void turnOn() {

		System.out.println("SmartTV on");

	}

	@Override
	public void turnOff() {

		System.out.println("SmartTV off");
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub

		System.out.println("SmartTV searching : " +url);
	}

}
