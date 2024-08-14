package ch06.sec08;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력하세요");
		int x = scan.nextInt(); 
		int y = scan.nextInt();		
//		Calculator cal = new Calculator();
//		cal.powerOn();

//		
//		int result1 = cal.plus(x, y);
//		double result2 = cal.divide(x, y);
//		System.out.printf("plus:%d devide:%.2f",result1,result2);

		Calculator myCalcu = new Calculator();
		
		double result1 = myCalcu.areaRectangle((double)x);
		
		double result2 = myCalcu.areaRectangle((double)x,(double)y);
		
		System.out.printf("정사각형 넓이= %.2f 직사각형의 넓이=%.2f ",result1,result2);
		
	}

}
