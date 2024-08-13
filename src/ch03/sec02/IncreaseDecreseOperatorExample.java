package ch03.sec02;

public class IncreaseDecreseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int b = 10;
		int a = 10;
		int z;
		x++;
		System.out.printf("계산전 x:%d, y:%d\n", x,y);

		System.out.println(++x);
		System.out.println(y++);
		
		System.out.printf("계산후 x:%d, y:%d\n", x,y);
		x = 10; y= 10;
		x++;
		System.out.printf("계산전 x:%d, y:%d\n", x,y);

		System.out.println(--x);
		System.out.println(y--);
		
		System.out.printf("계산후 x:%d, y:%d\n", x,y);

		
		
	
	}
}
