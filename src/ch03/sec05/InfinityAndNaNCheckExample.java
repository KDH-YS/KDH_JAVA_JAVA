package ch03.sec05;

public class InfinityAndNaNCheckExample {
	public static void main(String[ ] args) {
		int x = 5;
		double y = 0.0;
		double z1 = x/y;
		double z2 = x%y;
		
		System.out.printf("Z1:%f \nZ2:%f", z1,z2);
	}
}
