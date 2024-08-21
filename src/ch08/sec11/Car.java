package ch08.sec11;

public class Car {
	Tire FrontTire = new HankookTire();
	Tire BackTire = new HankookTire();
	
	void run() {
		FrontTire.run();
		BackTire.run();
	}
	
}
