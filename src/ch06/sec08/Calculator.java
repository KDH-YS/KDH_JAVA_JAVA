package ch06.sec08;

public class Calculator {
	void powerOn() {
		System.out.println("전원 온");
	}
	void powerOff() {
		System.out.println("전원 오프");
	}
	int plus(int x, int y) {
		return x+y;
	}
	double divide(int x, int y) {
		return (double)x/y;
	}
	
	double areaRectangle(double width) {
		return width *width;
	}
	double areaRectangle(double width,double height) {
		return width *height;
	}
	
	
}
