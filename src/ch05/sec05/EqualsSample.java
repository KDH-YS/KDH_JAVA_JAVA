package ch05.sec05;

public class EqualsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "홍길동";
		String name2 = "엄복동";
		String name3 = "동";
		String name4 = name1;
		String name5 = "홍길"+name3;
		
		System.out.println("name1 hashCode: "+ System.identityHashCode(name1));
		System.out.println("name2 hashCode: "+ System.identityHashCode(name2));
		System.out.println("name3 hashCode: "+ System.identityHashCode(name3));
		System.out.println("name4 hashCode: "+ System.identityHashCode(name4));
		System.out.println("name5 hashCode: "+ System.identityHashCode(name5));

		System.out.println(name1.equals(name3));
		System.out.println(name1.equals("홍길"+name3));
		System.out.println(name1.equals(name5));
		System.out.println(name1 ==("홍길"+name3));
		System.out.println(name1 ==name5);
		
	}

}
