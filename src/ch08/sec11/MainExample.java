package ch08.sec11;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		car.run();
		
		//금호로 교체
		car.FrontTire = new KumhoTire();
		car.BackTire = new KumhoTire();
		
		car.run();
		
		
	}

}
