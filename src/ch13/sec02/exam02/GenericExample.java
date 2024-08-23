package ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeAgency HA = new HomeAgency();
		Home home = HA.rent();
		home.turnOnLight();
		
		CarAgency CA = new CarAgency();
		Car car = CA.rent();
		car.run();
	}

}
