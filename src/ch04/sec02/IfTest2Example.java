package ch04.sec02;

import java.util.Scanner;

public class IfTest2Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String name =scan.nextLine();
		int money = (int)(Math.random()*1000)*10000;
		System.out.printf("%s님은 %d원이 당첨되쎳습니다.",name,money);
	}


}


