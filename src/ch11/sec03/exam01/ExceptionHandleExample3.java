package ch11.sec03.exam01;

import java.lang.reflect.Array;

public class ExceptionHandleExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array ={"100","1oo"};
		
		for (int i = 0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+"]:"+value);
				} catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("배열 인덱스가 초과됨: " +e.getMessage());
				} catch(NumberFormatException e) {
					System.out.println("숫자로 변환할 수 없음");
				}
			
		}
	}

}
