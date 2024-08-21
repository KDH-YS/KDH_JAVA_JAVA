package ch12.sec03.exam04;

public class RecordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member("winter","눈송이",25);
		System.out.printf("아이디: %s, 이름: %s, 나이: %d\n",m.id(),m.name(),m.age());
		
		System.out.println(m.toString());
		
		Member m1 = new Member("winter","눈송이",25);
		Member m2 = new Member("winter","눈송이",25);
		System.out.println("m1.hashCode():"+m1.hashCode());
		System.out.println("m2.hashCode():"+m2.hashCode());
		System.out.println("m1.equals(m2)"+m1.equals(m2));
		
	}

}
