package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("x값입력:");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);

		System.out.print("y값입력:");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);

		System.out.printf("%d + %d = %d\n", x, y, x + y);
		System.out.printf("%d - %d = %d\n", x, y, x - y);
		System.out.printf("%d * %d = %d\n", x, y, x * y);
		System.out.printf("%d / %d = %f4\n", x, y, (double) x / y);

		while (true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if (data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");

	}

}
