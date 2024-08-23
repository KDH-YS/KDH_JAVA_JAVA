package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course.regCouse1(new Applicant<Person>(new Person()));
		Course.regCouse1(new Applicant<Worker>(new Worker()));
		Course.regCouse1(new Applicant<Student>(new Student()));
		Course.regCouse1(new Applicant<HighStudent>(new HighStudent()));
		Course.regCouse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
//		Course.regCouse2(new Applicant<Person>(new Person()));
//		Course.regCouse2(new Applicant<Worker>(new Worker()));
		Course.regCouse2(new Applicant<Student>(new Student()));
		Course.regCouse2(new Applicant<HighStudent>(new HighStudent()));
		Course.regCouse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		Course.regCouse3(new Applicant<Person>(new Person()));
		Course.regCouse3(new Applicant<Worker>(new Worker()));
//		Course.regCouse3(new Applicant<Student>(new Student()));
//		Course.regCouse3(new Applicant<HighStudent>(new HighStudent()));
//		Course.regCouse3(new Applicant<MiddleStudent>(new MiddleStudent()));

		
		
	}

}
