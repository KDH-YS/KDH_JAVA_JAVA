package ch03.sec08;

public class BitLogicExample {
	public static void main(String[] args) {
		int x = 45;
		int y = 25;		
		System.out.printf("%d & %d = %d \n",x,y,x&y);		
		System.out.printf("%d | %d = %d \n",x,y,x|y);
		System.out.printf("%d ^ %d = %d \n",x,y,x^y);
		System.out.printf("~%d = %d \n",x,~x);
		System.out.println("~~~~~~~~~~~~~~~~~~");
		
		byte receiveData1 = -120;
		
		int unsignedInt1 = receiveData1 & 255;
		System.out.println(unsignedInt1);
	}
}
