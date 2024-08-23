package ch13.sec05;

public class Course {
	
	public static void regCouse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이(가) Course1을 등록함");
					
	}
	public static void regCouse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이(가) Course2(학생)을 등록함");
					
	}
	public static void regCouse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이(가) Course3(직장인)을 등록함");
					
	}

}
