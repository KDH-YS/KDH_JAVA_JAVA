package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("날짜\t품목\t단가\t수량\t금액");
		System.out.println("3/7\t카라멜마끼야또\t20000\t\t20000");
		System.out.println("12/15\t라떼\t2\t20000");
		System.out.println("4/8\t아이스아메리카노(샷추가)\t2000\t3\t6000");

		System.out.printf("%-5s%7s %-5s %-5s %-30s\n", "날짜", "단가", "수량", "금액", "품목");
		System.out.printf("%5s %8d %-5d %5d %-30s\n", "03/07", 20000, 1, 20000, "카라멜마끼야또");
		System.out.printf("%5s %8d %-5d %5d %-30s\n", "12/15", 2000, 2, 4000, "라떼");
		System.out.printf("%5s %8d %-5d %5d %-30s\n", "04/08", 2000, 3, 6000, "아이스아메리카노");

		int value = 123;
		System.out.printf("상품의 가격 %d원\n", value);
		System.out.printf("상품의 가격 %6d원\n", value);
		System.out.printf("상품의 가격 %-6d원\n", value);
		System.out.printf("상품의 가격 %06d원\n", value);
	}

}
