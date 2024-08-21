package ch08.sec10;

public class Taxi implements Vehicle {
	String rt;
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
	public void setRoute(String rt) {
		this.rt = rt;
		System.out.printf("%s로 갑시다\n", rt);
	}
}
