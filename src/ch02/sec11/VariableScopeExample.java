package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
		int v2 = 12;
		int v3 = v2 + 5;
		System.out.println(v3);
	}

}
