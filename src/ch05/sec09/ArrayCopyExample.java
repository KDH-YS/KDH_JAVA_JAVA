package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java", "array","copy"};
		String[] newStrArray = new String[5];

		printArr(oldStrArray);
		printArr(newStrArray);
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 3);
		printArr(oldStrArray);
		printArr(newStrArray);
		
		
	}

	public static void printArr(String[] Arr) {
		for(int idx = 0; idx<Arr.length; idx++) {
			int iTempo = System.identityHashCode(Arr[idx]);
			System.out.printf("주소:%d, 값:%s\n", iTempo,Arr[idx]);
		}
		System.out.println("-------------");
	}
}
