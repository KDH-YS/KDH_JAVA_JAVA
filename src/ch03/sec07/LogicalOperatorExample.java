package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = '7';
		
		if((65<=charCode)&(charCode<=90)) {
			System.out.println((char)charCode+"는 대문자이군요.");
		}else if((97<=charCode)&&((char)charCode <=122)) {
			System.out.println((char)charCode+"는소문자이군요.");
		}else if((48<=charCode)&&(charCode<=57)) {
			System.out.println((char)charCode+"는 숫자군요.");
		}
		
		int value = 6;
		
		if((value%2==0) || (value%3==0)) {
			System.out.println(value+"는2 또는 3의 배수입니다.");
		}		
		boolean result = ((value%2==0) || (value%3==0));
		if(!result) {
		System.out.println(value+"는2 또는 3의 배수가아닙니다.");
		}
	}

}
