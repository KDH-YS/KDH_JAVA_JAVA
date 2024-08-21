package ch12.sec03.exam01;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mbr1 = new Member("홍길동");
		Member mbr2 = new Member("홍길동");
		Member mbr3 = new Member("엄복동");
		User usr1 = new User("엄복동");
		
		System.out.printf("mbr1==mbr2 => %s\n", mbr1.equals(mbr2));
		System.out.printf("mbr1==mbr3 => %s\n", mbr1.equals(mbr3));
		System.out.printf("mbr2==mbr3 => %s\n", mbr2.equals(mbr3));
		System.out.printf("mbr3==usr3 => %s\n", mbr3.equals(usr1));
		
		System.out.printf("mbr hashcode : %d\n", mbr1.hashCode());
		System.out.printf("mbr hashcode : %d\n", mbr2.hashCode());
		System.out.printf("mbr hashcode : %d\n", mbr3.hashCode());
		System.out.printf("mbr hashcode : %d", usr1.hashCode());

	}

}
