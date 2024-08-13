package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String[] intArray = {"Hello world","Hi world"};
		intArray[0]= "Hello java";
		System.out.println(intArray[1]);
		
		String str = "엄복동";
		System.out.println("총 문자 수: "+ str.length());
	}
}
