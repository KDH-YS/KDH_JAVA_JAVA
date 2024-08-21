package ch08.sec11.exam02;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver dv = new Driver("엄복동");

		Bus bus = new Bus();
		dv.drive(bus);
		
		Taxi taxi = new Taxi();
		dv.drive(taxi);
		
		
	}

}
