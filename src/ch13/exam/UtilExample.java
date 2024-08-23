package ch13.exam;

public class UtilExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> pair = new Pair<>("홍길동",35);
		Integer age = Util.getValue(pair,"홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("엄복동", 25);
		Integer childAge = Util.getValue(childPair,"장발장");
		System.out.println(childAge);
	}
	
	

}
