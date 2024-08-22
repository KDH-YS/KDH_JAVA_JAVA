package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbr = new StringBuilder();
		sbr.append("DEF");
		System.out.println(sbr.toString());
		sbr.insert(0,"ABS");
		System.out.println(sbr.toString());
		sbr.delete(3,4);
		System.out.println(sbr.toString());
		
	}
}