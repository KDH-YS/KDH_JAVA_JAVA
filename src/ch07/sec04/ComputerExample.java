package ch07.sec04;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int r = 10;
	
	Calculator cal = new Calculator();
	System.out.printf("원 면적: %s \n", cal.areaCircle(r));
	System.out.println();

	Computer com = new Computer();
	System.out.printf("원 면적: %s \n", com.areaCircle(r));
	System.out.println();
	
	}

}
