package ch12.sec05;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println("==:"+ (obj1 ==obj2));
		System.out.println("equlas():"+ obj1.equals(obj2));
		System.out.println();
		
		Integer obj3 = 127;
		int obj4 = 127;
		System.out.println("==:"+ (obj3 ==obj4));
		System.out.println("equlas():"+ obj3.equals(obj4));
		System.out.println();
		
	}

}
