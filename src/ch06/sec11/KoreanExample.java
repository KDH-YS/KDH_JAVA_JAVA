package ch06.sec11;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean yjh = new Korean();
		yjh.ssn = "961011-1234567";
		yjh.name= "윤지현";
		
		System.out.printf("%s %s %s\n",
				yjh.nation,
				yjh.ssn,
				yjh.name);

		yjh.name = "홍지민";
		yjh.ssn = "123456-1234567";
		
		System.out.printf("%s %s %s\n",
				yjh.nation,
				yjh.ssn,
				yjh.name);
	}
	

}
