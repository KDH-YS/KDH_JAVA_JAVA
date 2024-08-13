package ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("남은양: " + result);
		
		double result1 = (apple*10 - number*(pieceUnit*10))/10;
		System.out.println("남은양: " + result1);
		
	}

}
