package ch05.sec05;

import java.util.Scanner;

public class CharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("생년월일을 입력하세요 :");
//        String strNum = scanner.nextLine();
        String strNum = "640812-1234567";
		String today = "20240812";
		int cen = (strNum.charAt(7)=='1' || strNum.charAt(7)=='2')? 1900:2000;
//		char gender = strNum.charAt(7);
//		System.out.println(gender);
//		switch (gender) {
//		case '1':
//		case '3':
//			System.out.println("남자입니다");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자입니다");
//			break;
//		}
		
		int tday= Integer.parseInt(today.substring(4,8));
		int birth = Integer.parseInt(strNum.substring(0,2))+cen;
		int bday = Integer.parseInt(strNum.substring(2,6));

		if(birth>2005) {
			if(birth==2006 && bday<=tday ) {
				System.out.println("성인입니다.");
			} else {
			System.out.println("미성년자입니다.");}
		}else if(birth<2006 && birth>1963){

			if(birth==1964 && bday<=tday ) {
				System.out.println("경노우대자 입니다.");
			}else {
			System.out.println("성인입니다.");}
		} else if(birth<1964) {
			System.out.println("경노우대자 입니다.");
		}
//		scanner.close();
	}

}
