package ch06.sec07;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test myCar = new Test();
		Test yourCar = new Test();
		
		myCar.car("포르쉐");
		yourCar.car("부가티");
		
		myCar.setSpeed(500);
		yourCar.setSpeed(600);
		
		myCar.frun();
		yourCar.frun();
	}

}
