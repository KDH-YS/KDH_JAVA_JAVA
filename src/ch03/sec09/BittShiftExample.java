package ch03.sec09;

public class BittShiftExample {

	public static void main(String[] args) {
		byte num1 = 2;
		int shift = 3;
		byte result1 = (byte)(num1 << shift);
		System.out.printf(" %d << %d = %d\n",num1, shift, result1);
		int num = Integer.parseInt(Integer.toBinaryString(num1 & 0xFF));
		int result = Integer.parseInt(Integer.toBinaryString(result1 & 0xFF));		
		System.out.printf("%08d << %d = %08d\n",num, shift, result );
		int num2 = -8;
		int result3 = num2>>3;
		int result4 = num2 / (int)Math.pow(2,3);
		System.out.println("result3 : "+ result3);
		System.out.println("result4 : "+ result4);
	}

}
