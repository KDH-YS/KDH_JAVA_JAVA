package ch05.sec06;

public class LengthExample {
	public static void main(String[ ] args) {
		String ssn = "123456789";
		int len = ssn.length();
		System.out.println("문자열길이: "+ len);
		String oldStr = "홍길동은 어려서 집을 나왔습니다. 그래서 홍길동은 어렵게 성장했습니다.";
		System.out.println(oldStr);
		
		String newStr = oldStr.replace("홍길동", "엄복동");
		System.out.println(newStr);
		
		ssn = "880102-1234567";
		String birthDay = ssn.substring(2,6);
		System.out.println("생일: " +birthDay);
		
		char gender= ssn.charAt(7);
		String date = (gender=='1' || gender=='2')? "19":"20"; 
		date += ssn.substring(0,2)+ "-"+ssn.substring(2,4)+"-"+ssn.substring(4,6);
		
		System.out.println("생일: "+date);
		
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		boolean bool= subject.contains("자바");
		System.out.println(bool);
		

	}
}
