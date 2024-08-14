package ch06.sec10;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result1 = 10*10*Calculator.pi;
		
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.printf("result1: %.3f\nresult2: %d\nresult3: %d", result1,result2,result3);
	}

}
