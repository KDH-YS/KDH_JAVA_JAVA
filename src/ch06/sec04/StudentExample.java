package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		s1.printName();
		Student s2 = new Student();
		System.out.println("s2 변수가 또다른 Student 객체를 참조합니다.");
		s2.name="엄복동";
		s2.printName();
		}

}
