package ch05.sec08;

public class ArrayStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
//		int iTempo = System.identityHashCode(strArray[0]);
//		System.out.println(iTempo);
//		iTempo = System.identityHashCode(strArray[1]);
//		System.out.println(iTempo);
//		iTempo = System.identityHashCode(strArray[2]);
//		System.out.println(iTempo);

		printArr(strArray);
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[2]==strArray[1]);
		System.out.println(strArray[2].equals((strArray)[1]));
		System.out.println("-----------");
		strArray[1]= "c++";
		strArray[0] = "java script";
		printArr(strArray);
		System.out.println("-----------");
		
		String[] newArray = new String[4];
		
		System.arraycopy(strArray, 0, newArray, 2,2);
		
		printArr(newArray);

		
		
	}
	
	public static void printArr(String[] Arr) {
		for(int idx = 0; idx<Arr.length; idx++) {
			int iTempo = System.identityHashCode(Arr[idx]);
			System.out.printf("주소:%d, 값:%s\n", iTempo,Arr[idx]);
		}
	}
}
